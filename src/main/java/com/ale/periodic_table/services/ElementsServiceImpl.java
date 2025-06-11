package com.ale.periodic_table.services;

import com.ale.periodic_table.entities.Element;
import com.ale.periodic_table.entities.ElementDTO;
import com.ale.periodic_table.repositories.ElementsRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
@Service
public class ElementsServiceImpl implements ElementsService{

    final private ElementsRepository repository;
    public ElementsServiceImpl(ElementsRepository elementsRepository) {
        this.repository = elementsRepository;
    }

    @Transactional(readOnly = true)
    @Override
    public List<Element> findAll() {
        return (List<Element>) repository.findAll();
    }

    @Transactional(readOnly = true)
    @Override
    public Optional<Element> findByName(String name) {
        return repository.findByName(name);
    }

    @Transactional(readOnly = true)
    @Override
    public Optional<Element> findBySymbol(String symbol) {
        return repository.findBySymbol(symbol);
    }

    @Transactional(readOnly = true)
    @Override
    public Optional<Element> findByAtomicNumber(int atomicNumber) {
        return repository.findByAtomicnumber(atomicNumber);
    }

    //TODO
    @Transactional(readOnly = true)
    @Override
    public Optional<Element> findByAtomicMass(double mass) {
        return repository.findByAtomicmass(mass);
    }

    //TODO
    @Transactional(readOnly = true)
    @Override
    public List<Element> findByGroup(String group) {
        return repository.findByGroup(group);
    }
}
