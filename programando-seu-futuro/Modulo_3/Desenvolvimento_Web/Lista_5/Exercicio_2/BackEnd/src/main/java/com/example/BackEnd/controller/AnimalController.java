package com.example.BackEnd.controller;

import com.example.BackEnd.model.AnimalModel;
import com.example.BackEnd.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/animal")
@CrossOrigin("*")
public class AnimalController {
    @Autowired
    AnimalService service;

    @GetMapping("/getAll")
    public List<AnimalModel>getAll(){
        return service.getAll();
    }
    @PostMapping("/postAnimal")
    public void postAnimal(@RequestBody AnimalModel animal){
        service.postAnimal(animal);
    }
}
