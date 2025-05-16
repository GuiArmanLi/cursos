package com.example.ecommerce.service;

import com.example.ecommerce.db.ProdutosBD;
import com.example.ecommerce.model.CosmeticoModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.logging.Logger;

@Component
public class CosmeticoService {
    @Autowired
    ProdutosBD bancoDeDados;

    public List<CosmeticoModel> getAllProducts() {

        return this.bancoDeDados.findAll();
    }

    public CosmeticoModel getByNome(String nome) {
        for (CosmeticoModel cosmetico : this.bancoDeDados.findAll()) {
            if (cosmetico.getNome().equalsIgnoreCase(nome)) {
                return cosmetico;
            }
        }
        return null;
    }

    public void adicionarProduto(CosmeticoModel newCosmetico) {
        for (CosmeticoModel cosmetico : this.bancoDeDados.findAll()) {
            if (cosmetico.getNome().equalsIgnoreCase(newCosmetico.getNome())) {
                Logger.getLogger("Logger").info("Produto ja existente no banco del dados!");
                return;
            }
        }
        this.bancoDeDados.adicionar(newCosmetico);
    }

    public void deletarProduto(String nome) {
        for (CosmeticoModel cosmetico : this.bancoDeDados.findAll()) {
            if (cosmetico.getNome().equalsIgnoreCase(nome)) {
                this.bancoDeDados.deletar(cosmetico);
                return;
            }
        }
        Logger.getLogger("Logger").info("Produto nao consta en el banco del dados!");
    }
}
