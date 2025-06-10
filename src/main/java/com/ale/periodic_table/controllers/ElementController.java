package com.ale.periodic_table.controllers;

import com.ale.periodic_table.entities.Element;
import com.ale.periodic_table.exceptions.ElementNotFoundException;
import com.ale.periodic_table.exceptions.GroupNotFoundException;
import com.ale.periodic_table.services.ElementsService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/elements")
//TODO Add cross origin
public class ElementController {

    //Constructor injection
    final private ElementsService service;
    public ElementController(ElementsService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<Element>> list() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/name/{name}")
    public ResponseEntity<Element> getByName(@PathVariable String name) {
        Optional<Element> element = service.findByName(name);
        if (element.isEmpty()) {
            throw new ElementNotFoundException();
        }
        return ResponseEntity.ok(element.orElseThrow());
    }

    @GetMapping("/symbol/{symbol}")
    public ResponseEntity<Element> getBySymbol(@PathVariable String symbol) {
        Optional<Element> element = service.findBySymbol(symbol);
        if (element.isEmpty()) {
            throw new ElementNotFoundException();
        }
        return ResponseEntity.ok(element.orElseThrow());
    }

    @GetMapping("/atomic/number/{number}")
    public ResponseEntity<Element> getByAtomicNumber(@PathVariable int number) {
        Optional<Element> element = service.findByAtomicNumber(number);
        if (element.isEmpty()) {
            throw new ElementNotFoundException();
        }
        return ResponseEntity.ok(element.orElseThrow());
    }

    @GetMapping("/atomic/mass/{mass}")
    public ResponseEntity<Element> getByAtomicMass(@PathVariable double mass) {
        Optional<Element> element = service.findByAtomicMass(mass);
        if (element.isEmpty()) {
            throw new ElementNotFoundException();
        }
        return ResponseEntity.ok(element.orElseThrow());
    }

    @GetMapping("/group/{group}")
    public ResponseEntity<List<Element>> getByGroup(@PathVariable String group) {
        List<Element> elements = service.findByGroup(group);
        if (elements.isEmpty()) {
            throw new GroupNotFoundException();
        }
        return ResponseEntity.ok(service.findByGroup(group));
    }
}
