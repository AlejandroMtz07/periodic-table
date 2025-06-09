package com.ale.periodic_table.entities;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;


@Entity
@Table(name = "compounds")
public class Compound {

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
    double molecularmass;
    @NotEmpty
    String properties;

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

    public double getMolecularmass() {
        return molecularmass;
    }

    public void setMolecularmass(double molecularMass) {
        this.molecularmass = molecularMass;
    }

    public String getProperties() {
        return properties;
    }

    public void setProperties(String properties) {
        this.properties = properties;
    }
}
