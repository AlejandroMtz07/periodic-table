package com.ale.periodic_table.repositories;

import com.ale.periodic_table.entities.Element;
import com.ale.periodic_table.entities.ElementDTO;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ElementsRepository extends CrudRepository<Element, Integer> {

    //This interface implements Query Methods which translate a method name
    //by convention into a SQL query

    Optional<Element> findByName(String name);

    Optional<Element> findBySymbol(String symbol);

    Optional<Element> findByAtomicnumber(int atomicnumber);

    Optional<Element> findByAtomicmass(double atomicmass);

    List<Element> findByGroup(String group);


}
