package com.ale.periodic_table.entities;

public class ElementDTO {

    private int atomicNumber;
    private String name;
    private String symbol;
    private double atomicMass;
    private String group;
    private String description;

    public ElementDTO(Element element) {
        this.atomicNumber = element.getAtomicnumber();
        this.name = element.getName();
        this.symbol = element.getSymbol();
        this.atomicMass = element.getAtomicmass();
        this.group = element.getGroup();
        this.description = element.getDescription();
    }

    public int getAtomicNumber() {
        return atomicNumber;
    }

    public void setAtomicNumber(int atomicNumber) {
        this.atomicNumber = atomicNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public double getAtomicMass() {
        return atomicMass;
    }

    public void setAtomicMass(double atomicMass) {
        this.atomicMass = atomicMass;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
