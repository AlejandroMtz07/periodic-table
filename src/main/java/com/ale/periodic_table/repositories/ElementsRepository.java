package com.ale.periodic_table.repositories;

import com.ale.periodic_table.entities.Element;
import org.springframework.data.repository.CrudRepository;

import javax.lang.model.util.Elements;
import java.util.Optional;

public interface ElementsRepository extends CrudRepository<Element, Integer> {

    Optional<Element> findByName(String name);

    //This interface inherits the necessary CRUD methods for the Periodic table API

}
