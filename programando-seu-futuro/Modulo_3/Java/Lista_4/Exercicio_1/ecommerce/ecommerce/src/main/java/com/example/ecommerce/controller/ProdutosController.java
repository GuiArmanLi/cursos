package com.example.ecommerce.controller;

import com.example.ecommerce.model.CosmeticoModel;
import com.example.ecommerce.services.CosmeticosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cosmeticos")
@CrossOrigin("*")
public class ProdutosController {
    @Autowired
    CosmeticosService service;

    @GetMapping
    public List<CosmeticoModel> getProducts() {
        return service.getAllProducts();
    }

    @GetMapping("/{nome}")
    public CosmeticoModel getByNome(@PathVariable String nome) {
        return service.getByNome(nome);
    }

    @PostMapping
    public void adicionarProduto(@RequestBody CosmeticoModel cosmetico) {
        service.adicionarProduto(cosmetico);
    }

    @DeleteMapping("/{nome}")
    public void deletarProduto(@PathVariable String nome) {
        service.deletarProduto(nome);
    }
}
