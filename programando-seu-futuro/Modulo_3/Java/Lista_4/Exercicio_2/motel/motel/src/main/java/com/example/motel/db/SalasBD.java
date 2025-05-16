package com.example.motel.db;

import com.example.motel.model.SalaModel;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class SalasBD {
    List<SalaModel> salas = new ArrayList<>();

    public List<SalaModel> findAll() {
        return this.salas;
    }

    public void adicionar(SalaModel sala) {
        this.salas.add(sala);
    }

}
