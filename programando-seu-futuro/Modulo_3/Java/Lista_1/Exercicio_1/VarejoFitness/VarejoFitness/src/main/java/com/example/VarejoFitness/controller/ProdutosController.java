package com.example.VarejoFitness.controller;

import com.example.VarejoFitness.model.ProdutoModel;
import com.example.VarejoFitness.service.ProdutoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutosController {
    @Autowired
    ProdutoService service;

    @GetMapping
    public List<ProdutoModel> getProdutos() {
        return this.service.getProdutos();
    }

    @GetMapping("/{nome}")
    public ProdutoModel getByNome(@PathVariable String nome) {
        return this.service.getByNome(nome);
    }

    @PostMapping
    public void adicionarProduto(@RequestBody ProdutoModel produto) {
        this.service.adicionarProduto(produto);
    }
}
