package com.example.BackEnd.repository;

import com.example.BackEnd.model.AnimalModel;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AnimalRepository {
    public List<AnimalModel> animais = new ArrayList<AnimalModel>();

    public List<AnimalModel> findAll(){
        return animais;
    }

    public void save(AnimalModel animal){
        animais.add(animal);
    }

}
