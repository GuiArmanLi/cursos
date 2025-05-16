package com.example.BackEnd.model;

import org.springframework.stereotype.Component;

@Component
public class AnimalModel {
    public int id;
    public String name;
    public String raca;

    public AnimalModel() {
    }

    public AnimalModel(int id, String name, String raca) {
        this.id = id;
        this.name = name;
        this.raca = raca;
    }

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

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
}
