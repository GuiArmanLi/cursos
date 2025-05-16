package com.example.motel.model;

import java.util.UUID;

public class SalaModel {
    private UUID id;
    private boolean estaAlugada;
    private String nomeLocatario;

    public SalaModel() {
        this.id = UUID.randomUUID();
    }

    public SalaModel(boolean estaAlugada, String nomeLocatario) {
        this.id = UUID.randomUUID();
        this.estaAlugada = estaAlugada;
        this.nomeLocatario = nomeLocatario;
    }

    public UUID getId() {
        return id;
    }

    public boolean isEstaAlugada() {
        return estaAlugada;
    }

    public void setEstaAlugada(boolean estaAlugada) {
        this.estaAlugada = estaAlugada;
    }

    public String getNomeLocatario() {
        return nomeLocatario;
    }

    public void setNomeLocatario(String nomeLocatario) {
        this.nomeLocatario = nomeLocatario;
    }
}
