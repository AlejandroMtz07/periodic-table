package com.ale.periodic_table.repositories;

import com.ale.periodic_table.entities.Compound;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface CompoundsRepository extends CrudRepository<Compound,Integer> {

    //Get a compound by his name
    Optional<Compound> findByName(String name);

    //Get a compound by his formula
    Optional<Compound> findByFormula(String formula);

    //Get a compounds by his type
    List<Compound> findByType(String type);

    //Get compounds by his state
    List<Compound> findByState(String state);

}
