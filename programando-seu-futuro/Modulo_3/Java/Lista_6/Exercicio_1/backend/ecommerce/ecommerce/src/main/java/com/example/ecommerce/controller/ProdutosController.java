package com.example.ecommerce.controller;

import com.example.ecommerce.model.CosmeticoModel;
import com.example.ecommerce.service.CosmeticoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cosmeticos")
@CrossOrigin("*")
public class ProdutosController {
    @Autowired
    CosmeticoService service;

    @GetMapping
    public List<CosmeticoModel> getProducts() {
        return this.service.getAllProducts();
    }

    @GetMapping("/{nome}")
    public CosmeticoModel getByNome(@PathVariable String nome) {
        return this.service.getByNome(nome);
    }

    @PostMapping
    public void adicionarProduto(@RequestBody CosmeticoModel cosmetico) {
        this.service.adicionarProduto(cosmetico);
    }

    @DeleteMapping("/{nome}")
    public void deletarProduto(@PathVariable String nome) {
        this.service.deletarProduto(nome);
    }
}
