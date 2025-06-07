package com.ale.periodic_table.repositories;

import com.ale.periodic_table.entities.Element;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ElementsRepository extends CrudRepository<Element, Integer> {

    //Find an element by his name
    Optional<Element> findByName(String name);

    //Find an element by his symbol
    Optional<Element> findBySymbol(String symbol);

    Optional<Element> findByAtomicnumber(int atomicnumber);

    Optional<Element> findByAtomicmass(double atomicmass);

    List<Element> findByGroup(String group);

    //This interface inherits the necessary CRUD methods for the Periodic table API

}
