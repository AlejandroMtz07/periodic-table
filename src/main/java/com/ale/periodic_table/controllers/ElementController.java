package com.ale.periodic_table.controllers;

import com.ale.periodic_table.entities.Element;
import com.ale.periodic_table.services.ElementsService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController("/")
//TODO Add cross origin
public class ElementController {

    final private ElementsService service;
    public ElementController(ElementsService service) {
        this.service = service;
    }

    @GetMapping("/elements")
    public ResponseEntity<List<Element>> list(){
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/name/{name}")
    public ResponseEntity<Optional<Element>> getByName(@PathVariable String name){
        Optional<Element> element = service.findByName(name);
        if(element.isPresent()){
            return ResponseEntity.ok(element);
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping("/symbol/{symbol}")
    public ResponseEntity<Optional<Element>> getBySymbol(@PathVariable String symbol){
        Optional<Element> element = service.findBySymbol(symbol);
        if(element.isPresent()){
            return ResponseEntity.ok(element);
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping("/atomic/{number}")
    public ResponseEntity<Optional<Element>> getByAtomic(@PathVariable int number){
        Optional<Element> element = service.findByAtomicNumber(number);
        if(element.isPresent()){
            return ResponseEntity.ok(element);
        }
        return ResponseEntity.notFound().build();
    }

}
