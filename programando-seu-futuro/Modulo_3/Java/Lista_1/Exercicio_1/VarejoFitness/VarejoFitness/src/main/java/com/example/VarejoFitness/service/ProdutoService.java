package com.example.VarejoFitness.service;

import com.example.VarejoFitness.db.ProdutoDB;
import com.example.VarejoFitness.model.ProdutoModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;

@Service
public class ProdutoService {
    @Autowired
    ProdutoDB produtos;

    public List<ProdutoModel> getProdutos() {
        return this.produtos.findAll();
    }

    public ProdutoModel getByNome(String nome) {
        for (ProdutoModel produto : this.produtos.findAll()) {
            if (produto.getNome().equals(nome)) {
                return produto;
            }
        }
        return null;
    }

    public void adicionarProduto(ProdutoModel newProduto) {
        for (ProdutoModel produto : this.produtos.findAll()) {
            if (produto.getNome().equalsIgnoreCase(newProduto.getNome())) {
                Logger.getLogger("Logger").info("Produto ja existente!");
            }
        }
        this.produtos.adicionar(newProduto);
    }
}
