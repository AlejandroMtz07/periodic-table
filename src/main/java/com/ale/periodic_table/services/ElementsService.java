package com.ale.periodic_table.services;

import com.ale.periodic_table.entities.Element;

import java.util.List;
import java.util.Optional;

public interface ElementsService {

    //Get all the elements in the database
    List<Element> findAll();

    //Get an element based on his name
    Optional<Element> findByName(String name);

    //Get an element based on his symbol
    Optional<Element> findBySymbol(String symbol);

    //Get an element based on his atomic number
    Optional<Element> findByAtomicNumber(int id);

    //Get an element based on his atomic mass
    Optional<Element> findByAtomicMass(double mass);

    //Get all the elements of the same group
    List<Element> findByGroup(String group);

}
