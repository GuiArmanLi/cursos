package com.example.Catalogo.db;

import org.springframework.stereotype.Repository;

import com.example.Catalogo.model.JogoModel;

import java.util.ArrayList;
import java.util.List;

@Repository
public class JogoBD {
    List<JogoModel> jogos = new ArrayList<>();

    public List<JogoModel> findAll() {
        return jogos;
    }

    public void adicionar(JogoModel jogo) {
        jogos.add(jogo);
    }
}
