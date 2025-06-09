package com.ale.periodic_table.controllers;

import com.ale.periodic_table.entities.Compound;
import com.ale.periodic_table.exceptions.CompoundNotFoundException;
import com.ale.periodic_table.exceptions.ElementNotFoundException;
import com.ale.periodic_table.exceptions.StateNotFoundException;
import com.ale.periodic_table.exceptions.TypeNotFoundException;
import com.ale.periodic_table.services.CompoundsService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/compounds")
public class CompoundController {

    final private CompoundsService service;
    public CompoundController(CompoundsService service) {
        this.service = service;
    }

    @GetMapping("/")
    public ResponseEntity<List<Compound>> listAll() {
        return ResponseEntity.ok(service.findAllCompounds());
    }
    @GetMapping("/name/{name}")
    public ResponseEntity<Compound> getByName(@PathVariable String name) {
        Optional<Compound> compound = service.findCompoundByName(name);
        if(compound.isEmpty()){
            throw new CompoundNotFoundException();
        }
        return ResponseEntity.ok(compound.get());
    }
    @GetMapping("/formula/{formula}")
    public ResponseEntity<Compound> getByFormula(@PathVariable String formula) {
        Optional<Compound> compound = service.getCompoundByFormula(formula);
        if(compound.isEmpty()){
            throw new CompoundNotFoundException();
        }
        return ResponseEntity.ok(compound.get());
    }

    @GetMapping("/type/{type}")
    public ResponseEntity<List<Compound>> getByType(@PathVariable String type) {
        List<Compound> compounds = service.getByType(type);
        if(compounds.isEmpty()){
            throw new TypeNotFoundException();
        }
        return ResponseEntity.ok(compounds);
    }

    @GetMapping("/state/{state}")
    public ResponseEntity<List<Compound>> getByState(@PathVariable String state) {
        List<Compound> compounds = service.getCompoundsByState(state);
        if(compounds.isEmpty()){
            throw new StateNotFoundException();
        }
        return ResponseEntity.ok(compounds);
    }

}
