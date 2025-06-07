package com.ale.periodic_table.repositories;

import com.ale.periodic_table.entities.Element;
import org.springframework.data.repository.CrudRepository;

import javax.lang.model.util.Elements;

public interface ElementsRepository extends CrudRepository<Element, Integer> {

    //This interface inherits the necessary CRUD methods for the Periodic table API

}
