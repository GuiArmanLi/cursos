package com.example.motel.controller;

import com.example.motel.model.SalaModel;
import com.example.motel.service.SalaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("motel")
public class SalaController {
    @Autowired
    SalaService service;

    @GetMapping
    public List<SalaModel> getSalas() {
        return this.service.getAll();
    }

    @PostMapping
    public void adicionarSala(@RequestBody SalaModel sala) {
        this.service.adicionarSala(sala);
    }

    @PutMapping("/{nome}")
    public void atualizarEstaAlugada(@PathVariable String nome) {
        this.service.atualizarEstaAlugada(nome);
    }
}
