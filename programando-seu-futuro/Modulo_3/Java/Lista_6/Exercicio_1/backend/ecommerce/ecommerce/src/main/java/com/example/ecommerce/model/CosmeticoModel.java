package com.example.ecommerce.model;

import java.util.UUID;

public class CosmeticoModel {
    private UUID id;
    private String nome;
    private double preco;
    private String image;

    public CosmeticoModel() {
        this.id = UUID.randomUUID();
    }

    public CosmeticoModel(String nome, double preco, String image) {
        this.id = UUID.randomUUID();
        this.nome = nome;
        this.preco = preco;
        this.image = image;
    }

    public UUID getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
