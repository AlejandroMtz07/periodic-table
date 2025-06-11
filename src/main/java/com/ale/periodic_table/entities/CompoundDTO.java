package com.ale.periodic_table.entities;

public class CompoundDTO {

    private String name;
    private String type;
    private String formula;
    private String state;
    private double molecularMass;
    private String properties;

    public CompoundDTO(Compound compound) {
        this.name = compound.getName();
        this.type = compound.getType();
        this.formula = compound.getFormula();
        this.state = compound.getState();
        this.molecularMass = compound.getMolecularmass();
        this.properties = compound.getProperties();
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

    public String getProperties() {
        return properties;
    }

    public void setProperties(String properties) {
        this.properties = properties;
    }
}
