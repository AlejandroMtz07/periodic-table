package com.ale.periodic_table.services;

import com.ale.periodic_table.entities.Compound;

import java.util.List;
import java.util.Optional;

public interface CompoundsService {

    //Get all the compounds
    List<Compound> findAllCompounds();

    //Get a compound by his name
    Optional<Compound> findCompoundByName(String name);

    //Get a compound by his type
    List<Compound> getByType(String type);

    //Get a compound by his formula
    Optional<Compound> getCompoundByFormula(String formula);

    //Get compounds by his state
    List<Compound> getCompoundsByState(String state);

}
