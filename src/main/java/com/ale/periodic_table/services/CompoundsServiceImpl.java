package com.ale.periodic_table.services;

import com.ale.periodic_table.entities.Compound;
import com.ale.periodic_table.repositories.CompoundsRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CompoundsServiceImpl implements CompoundsService {

    final private CompoundsRepository repository;
    public CompoundsServiceImpl(CompoundsRepository repository) {
        this.repository = repository;
    }

    //Getting all the compounds in the database
    @Override
    public List<Compound> findAllCompounds() {
        return (List<Compound>) repository.findAll();
    }

    @Override
    public Optional<Compound> findCompoundByName(String name) {
        return repository.findByName(name);
    }


    @Override
    public List<Compound> getByType(String type) {
        return (List<Compound>) repository.findByType(type);
    }

    @Override
    public Optional<Compound> getCompoundByFormula(String formula) {
        return repository.findByFormula(formula);
    }

    @Override
    public List<Compound> getCompoundsByState(String state) {
        return (List<Compound>) repository.findByState(state);
    }
}
