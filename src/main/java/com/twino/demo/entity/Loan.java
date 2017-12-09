package com.twino.demo.entity;

//todo: передалать в сущность @Entity
public class Loan {
    /** Название */
    private String name;


    public Loan() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
