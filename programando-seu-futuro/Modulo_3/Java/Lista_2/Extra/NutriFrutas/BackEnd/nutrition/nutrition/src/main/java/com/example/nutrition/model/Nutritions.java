package com.example.nutrition.model;

public class Nutritions {
    private int calories;
    private double fat;
    private double sugar;
    private double carboihydrates;
    private double protein;

    public Nutritions() {
    }

    public Nutritions(int calories, double fat, double sugar, double carboihydrates, double protein) {
        this.calories = calories;
        this.fat = fat;
        this.sugar = sugar;
        this.carboihydrates = carboihydrates;
        this.protein = protein;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public double getFat() {
        return fat;
    }

    public void setFat(double fat) {
        this.fat = fat;
    }

    public double getSugar() {
        return sugar;
    }

    public void setSugar(double sugar) {
        this.sugar = sugar;
    }

    public double getCarboihydrates() {
        return carboihydrates;
    }

    public void setCarboihydrates(double carboihydrates) {
        this.carboihydrates = carboihydrates;
    }

    public double getProtein() {
        return protein;
    }

    public void setProtein(double protein) {
        this.protein = protein;
    }

    @Override
    public String toString() {
        return "Nutritions [calories=" + calories + ", fat=" + fat + ", sugar=" + sugar + ", carboihydrates="
                + carboihydrates + ", protein=" + protein + "]";
    }
}
