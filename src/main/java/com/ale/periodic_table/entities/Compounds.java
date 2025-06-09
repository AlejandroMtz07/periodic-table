package com.ale.periodic_table.entities;


import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;

import java.util.List;
//@Entity
//@Table(name = "compounds")
public class Compounds {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @NotEmpty
    String name;
    @NotEmpty
    String type;
    @NotEmpty
    String formula;
    @NotEmpty
    String state;
    @NotEmpty
    double molecularMass;
    @NotEmpty
    List<String> properties;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFormula() {
        return formula;
    }

    public void setFormula(String formula) {
        this.formula = formula;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public double getMolecularMass() {
        return molecularMass;
    }

    public void setMolecularMass(double molecularMass) {
        this.molecularMass = molecularMass;
    }

    public List<String> getProperties() {
        return properties;
    }

    public void setProperties(List<String> properties) {
        this.properties = properties;
    }
}
