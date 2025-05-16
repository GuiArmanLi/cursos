package com.example.Catalogo.controller;

import com.example.Catalogo.model.JogoModel;
import com.example.Catalogo.service.JogoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/jogos")
public class JogoController {
    @Autowired
    JogoService serviceJogo;

    @GetMapping
    public List<JogoModel> getJogos() {
        return this.serviceJogo.getJogos();
    }

    @GetMapping("/{nome}")
    public JogoModel getByNome(@PathVariable String nome) {
        return this.serviceJogo.getByNome(nome);
    }

    @GetMapping("/menorPreco")
    public JogoModel getByMenorPreco() {
        return serviceJogo.getByMenorPreco();
    }

    @PostMapping
    public void adicionarJogo(@RequestBody JogoModel jogo) {
        this.serviceJogo.adicionarJogo(jogo);
    }
}
