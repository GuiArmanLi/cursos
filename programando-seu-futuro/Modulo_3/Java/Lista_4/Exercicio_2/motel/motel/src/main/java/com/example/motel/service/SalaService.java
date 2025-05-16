package com.example.motel.service;

import com.example.motel.db.SalasBD;
import com.example.motel.model.SalaModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;

@Service
public class SalaService {
    @Autowired
    SalasBD salas;

    public List<SalaModel> getAll() {
        return this.salas.findAll();
    }

    public void adicionarSala(SalaModel newSala) {
        for (SalaModel sala : this.salas.findAll()) {
            if (sala.getNomeLocatario().equalsIgnoreCase(newSala.getNomeLocatario())) {
                Logger.getLogger("Logger").info("Sala ja existente!");
                return;
            }
        }
        this.salas.adicionar(newSala);
    }

    public void atualizarEstaAlugada(String nome) {
        for (SalaModel sala : this.salas.findAll()) {
            if (sala.getNomeLocatario().equalsIgnoreCase(nome)) {
                sala.setEstaAlugada(!sala.isEstaAlugada());
            }
        }
    }
}
