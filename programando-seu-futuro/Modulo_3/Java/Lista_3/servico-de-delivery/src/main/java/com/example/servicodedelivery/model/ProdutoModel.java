package com.example.servicodedelivery.model;

import java.math.BigDecimal;
import java.util.UUID;

public class ProdutoModel {
    private UUID id;
    private String nome;
    private BigDecimal preco;

    public ProdutoModel() {
        this.id = UUID.randomUUID();
    }

    public ProdutoModel(String nome, BigDecimal preco) {
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

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }
}
