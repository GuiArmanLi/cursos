package com.example.VarejoFitness.db;

import org.springframework.stereotype.Repository;

import com.example.VarejoFitness.model.ProdutoModel;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProdutoDB {
    List<ProdutoModel> produtos = new ArrayList<>();

    public List<ProdutoModel> findAll() {
        return this.produtos;
    }

    public void adicionar(ProdutoModel produto) {
        this.produtos.add(produto);
    }
}
