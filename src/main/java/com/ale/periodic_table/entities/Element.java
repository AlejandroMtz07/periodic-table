package com.ale.periodic_table.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;


@Entity
@Table(name="elements")
public class Element {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotEmpty
    private String name;
    @NotEmpty
    @Size(min = 1, max = 2)
    private String symbol;
    @NotEmpty
    private int atomicnumber;
    @NotEmpty
    private double atomicmass;
    @NotEmpty
    private String group;
    @NotEmpty
    private String description;

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

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public int getAtomicnumber() {
        return atomicnumber;
    }

    public void setAtomicnumber(int atomicnumber) {
        this.atomicnumber = atomicnumber;
    }

    public double getAtomicmass() {
        return atomicmass;
    }

    public void setAtomicmass(double atomicmass) {
        this.atomicmass = atomicmass;
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
