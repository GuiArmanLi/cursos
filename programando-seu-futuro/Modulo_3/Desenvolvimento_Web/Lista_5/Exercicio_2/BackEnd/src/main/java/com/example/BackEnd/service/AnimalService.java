package com.example.BackEnd.service;

import com.example.BackEnd.model.AnimalModel;
import com.example.BackEnd.repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimalService {
    @Autowired
    AnimalRepository animais;

    public List<AnimalModel> getAll(){
        return animais.findAll();
    }

    public void postAnimal(AnimalModel animal){
        animais.save(animal);
    }
}
