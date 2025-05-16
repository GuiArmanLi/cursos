package com.example.nutrition.model;

public class FruitModel {
    private int id;
    private String name;
    private String family;
    private String order;
    private String genus;
    private Nutritions nutritions;

    public FruitModel() {
    }

    public FruitModel(int id, String name, String family, String order, String genus, Nutritions nutritions) {
        this.id = id;
        this.name = name;
        this.family = family;
        this.order = order;
        this.genus = genus;
        this.nutritions = nutritions;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public String getGenus() {
        return genus;
    }

    public void setGenus(String genus) {
        this.genus = genus;
    }

    public Nutritions getNutritions() {
        return nutritions;
    }

    public void setNutritions(Nutritions nutritions) {
        this.nutritions = nutritions;
    }

    @Override
    public String toString() {
        return "Fruit [id=" + id + ", name=" + name + ", family=" + family + ", order=" + order + ", genus=" + genus
                + ", nutritions=" + nutritions + "]";
    }
}
