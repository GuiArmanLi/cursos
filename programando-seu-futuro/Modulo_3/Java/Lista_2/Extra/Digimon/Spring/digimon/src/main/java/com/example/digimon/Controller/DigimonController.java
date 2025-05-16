package com.example.digimon.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.digimon.model.Digimon;
import com.example.digimon.service.DigimonService;

@RestController
@RequestMapping("/digimons")
public class DigimonController {
    @Autowired
    DigimonService service;

    @GetMapping
    public List<Digimon> getAll() {
        return this.service.getAll();
    }

}
