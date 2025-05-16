package com.example.VarejoFitness.model;

import java.util.UUID;

public class ProdutoModel {
    private UUID codigoDeBarras;
    private String nome;
    private double preco;

    public ProdutoModel() {
        this.codigoDeBarras = UUID.randomUUID();
    }

    public ProdutoModel(String nome, double preco) {
        this.codigoDeBarras = UUID.randomUUID();
        this.nome = nome;
        this.preco = preco;
    }

    public UUID getCodigoDeBarras() {
        return codigoDeBarras;
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
}
