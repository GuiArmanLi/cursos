package com.example.nutrition.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.nutrition.model.FruitModel;
import com.example.nutrition.service.FruitService;

@RestController
@RequestMapping("/fruits")
@CrossOrigin("*")
public class FruitController {
    @Autowired
    FruitService service;

    @GetMapping
    public List<FruitModel> getAll() {
        return this.service.getAll();
    }

    @GetMapping("/{name}")
    public FruitModel getByName(@PathVariable String name) {
        return this.service.getByName(name);
    }

    //Me enganaram, falaram que tinha PUT
    // @PutMapping
    // public void addFruit(@RequestBody FruitModel fruit) {
    // this.service.addFruit(fruit);
    // }
}
