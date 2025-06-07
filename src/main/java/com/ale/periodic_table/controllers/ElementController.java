package com.ale.periodic_table.controllers;

import com.ale.periodic_table.entities.Element;
import com.ale.periodic_table.services.ElementsService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/")
//TODO Add cross origin
public class ElementController {

    final private ElementsService service;
    public ElementController(ElementsService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<Element>> list(){
        return ResponseEntity.ok(service.findAll());
    }


}
