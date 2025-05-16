package com.example.Catalogo.model;

import java.util.UUID;

import org.springframework.stereotype.Component;

@Component
public class JogoModel {
    public UUID id;
    public String nome;
    public double preco;

    public JogoModel() {
        this.id = UUID.randomUUID();
    }

    public JogoModel(String nome, double preco) {
        this.id = UUID.randomUUID();
        this.nome = nome;
        this.preco = preco;
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
}
