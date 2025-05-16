package com.example.Catalogo.service;

import com.example.Catalogo.db.JogoBD;
import com.example.Catalogo.model.JogoModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.logging.Logger;

@Service
public class JogoService {
    @Autowired
    JogoBD jogos;

    public List<JogoModel> getJogos() {
        return this.jogos.findAll();
    }

    public JogoModel getByNome(String nome) {
        for (JogoModel jogo : this.jogos.findAll()) {
            if (jogo.getNome().equalsIgnoreCase(nome)) {
                return jogo;
            }
        }
        return null;
    }

    public JogoModel getByMenorPreco() {
        JogoModel jogoMenorPreco = null;
        double menorPreco = Double.MAX_VALUE;

        for (JogoModel jogo : this.jogos.findAll()) {
            if (jogo.getPreco() < menorPreco) {
                jogoMenorPreco = jogo;
            }
        }
        return jogoMenorPreco;
    }

    public void adicionarJogo(JogoModel newJogo) {
        for (JogoModel jogo : this.jogos.findAll()) {
            if (jogo.getNome().equalsIgnoreCase(newJogo.getNome())) {
                Logger.getLogger("Logger").info("Jogo ja existente!");
            }
        }

        this.jogos.adicionar(newJogo);
    }
}
