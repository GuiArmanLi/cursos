package com.example.endereco.controller;

import com.example.endereco.model.Endereco;
import com.example.endereco.service.EnderecoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/endereco")
public class EnderecoController {

    @Autowired
    EnderecoService service;

    @GetMapping("/{cep}")
    public ResponseEntity<Endereco> getByCep(@PathVariable String cep) {
        return this.service.findByCep(cep);
    }
}
