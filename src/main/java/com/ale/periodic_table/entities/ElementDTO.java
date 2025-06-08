package com.ale.periodic_table.entities;

public class ElementDTO {

    private String name;
    private String symbol;
    private int atomicnumber;
    private double atomicmass;
    private String group;
    private String description;

    public ElementDTO(Element element) {
        this.name = element.getName();
        this.symbol = element.getSymbol();
        this.atomicnumber = element.getAtomicnumber();
        this.atomicmass = element.getAtomicmass();
        this.group = element.getGroup();
        this.description = element.getDescription();
    }

}
