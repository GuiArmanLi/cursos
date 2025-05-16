package com.example.ecommerce.services;

import com.example.ecommerce.db.ProdutosBD;
import com.example.ecommerce.model.CosmeticoModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.logging.Logger;

@Component
public class CosmeticosService {
    @Autowired
    ProdutosBD produtos;

    public List<CosmeticoModel> getAllProducts() {
        return this.produtos.findAll();
    }

    public CosmeticoModel getByNome(String nome) {
        for (CosmeticoModel cosmetico : this.produtos.findAll()) {
            if (cosmetico.getNome().equalsIgnoreCase(nome)) {
                return cosmetico;
            }
        }
        return null;
    }

    public void adicionarProduto(CosmeticoModel newCosmetico) {
        for (CosmeticoModel cosmetico : this.produtos.findAll()) {
            if (newCosmetico.getId() == cosmetico.getId()) {
                Logger.getLogger("Logger").info("Produto ja existente no banco del dados!");
                return;
            }
        }
        this.produtos.adicionar(newCosmetico);
    }

    public void deletarProduto(String nome) {
        for (CosmeticoModel cosmetico : this.produtos.findAll()) {
            if (cosmetico.getNome().equalsIgnoreCase(nome)) {
                this.produtos.deletar(cosmetico);
            }
        }
        Logger.getLogger("Logger").info("Produto nao consta en el banco del dados!");
    }
}
