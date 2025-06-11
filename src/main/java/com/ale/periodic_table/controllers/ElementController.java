package com.ale.periodic_table.controllers;

import com.ale.periodic_table.entities.Element;
import com.ale.periodic_table.entities.ElementDTO;
import com.ale.periodic_table.exceptions.ElementNotFoundException;
import com.ale.periodic_table.exceptions.GroupNotFoundException;
import com.ale.periodic_table.services.ElementsService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/elements")
@CrossOrigin("http://192.168.0.5:5500")
public class ElementController {

    //Constructor injection
    final private ElementsService service;
    public ElementController(ElementsService service) {
        this.service = service;
    }

    //Returns a new List of ElementsDTO streaming over the list ot Elements
    @GetMapping
    public ResponseEntity<List<ElementDTO>> list() {
        List<Element> elements = service.findAll();
        return ResponseEntity.status(HttpStatus.OK)
                .body(elements.stream().map(ElementDTO::new).toList());
    }

    @GetMapping("/name/{name}")
    public ResponseEntity<ElementDTO> getByName(@PathVariable String name) {
        Optional<Element> element = service.findByName(name);
        if (element.isEmpty()) {
            throw new ElementNotFoundException();
        }
        return ResponseEntity.ok(new ElementDTO(element.get()));
    }

    @GetMapping("/symbol/{symbol}")
    public ResponseEntity<ElementDTO> getBySymbol(@PathVariable String symbol) {
        Optional<Element> element = service.findBySymbol(symbol);
        if (element.isEmpty()) {
            throw new ElementNotFoundException();
        }
        return ResponseEntity.ok(new ElementDTO(element.get()));
    }

    @GetMapping("/atomic/number/{number}")
    public ResponseEntity<ElementDTO> getByAtomicNumber(@PathVariable int number) {
        Optional<Element> element = service.findByAtomicNumber(number);
        if (element.isEmpty()) {
            throw new ElementNotFoundException();
        }
        return ResponseEntity.ok(new ElementDTO(element.get()));
    }

    @GetMapping("/atomic/mass/{mass}")
    public ResponseEntity<ElementDTO> getByAtomicMass(@PathVariable double mass) {
        Optional<Element> element = service.findByAtomicMass(mass);
        if (element.isEmpty()) {
            throw new ElementNotFoundException();
        }
        return ResponseEntity.ok(new ElementDTO(element.get()));
    }

    @GetMapping("/group/{group}")
    public ResponseEntity<List<ElementDTO>> getByGroup(@PathVariable String group) {
        List<Element> elements = service.findByGroup(group);
        if (elements.isEmpty()) {
            throw new GroupNotFoundException();
        }
        return ResponseEntity.ok(elements.stream().map(ElementDTO::new).toList());
    }
}
