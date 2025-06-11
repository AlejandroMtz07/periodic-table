package com.ale.periodic_table.controllers;

import com.ale.periodic_table.entities.Compound;
import com.ale.periodic_table.entities.CompoundDTO;
import com.ale.periodic_table.exceptions.CompoundNotFoundException;
import com.ale.periodic_table.exceptions.StateNotFoundException;
import com.ale.periodic_table.exceptions.TypeNotFoundException;
import com.ale.periodic_table.services.CompoundsService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/compounds")
@CrossOrigin("http://192.168.0.5:5500")
public class CompoundController {

    //Constructor injection
    final private CompoundsService service;
    public CompoundController(CompoundsService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<CompoundDTO>> listAll() {
        return ResponseEntity.ok(service.findAllCompounds().stream().map(CompoundDTO::new).toList());
    }

    @GetMapping("/name/{name}")
    public ResponseEntity<CompoundDTO> getByName(@PathVariable String name) {
        Optional<Compound> compound = service.findCompoundByName(name);
        if(compound.isEmpty()){
            throw new CompoundNotFoundException();
        }
        return ResponseEntity.ok(new CompoundDTO(compound.get()));
    }

    @GetMapping("/formula/{formula}")
    public ResponseEntity<CompoundDTO> getByFormula(@PathVariable String formula) {
        Optional<Compound> compound = service.getCompoundByFormula(formula);
        if(compound.isEmpty()){
            throw new CompoundNotFoundException();
        }
        return ResponseEntity.ok(new CompoundDTO(compound.get()));
    }

    @GetMapping("/type/{type}")
    public ResponseEntity<List<CompoundDTO>> getByType(@PathVariable String type) {
        List<Compound> compounds = service.getByType(type);
        if(compounds.isEmpty()){
            throw new TypeNotFoundException();
        }
        return ResponseEntity.ok(compounds.stream().map(CompoundDTO::new).toList());
    }

    @GetMapping("/state/{state}")
    public ResponseEntity<List<CompoundDTO>> getByState(@PathVariable String state) {
        List<Compound> compounds = service.getCompoundsByState(state);
        if(compounds.isEmpty()){
            throw new StateNotFoundException();
        }
        return ResponseEntity.ok(compounds.stream().map(CompoundDTO::new).toList());
    }

}
