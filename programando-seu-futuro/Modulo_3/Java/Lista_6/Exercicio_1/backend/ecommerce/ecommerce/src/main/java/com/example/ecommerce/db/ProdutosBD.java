package com.example.ecommerce.db;

import com.example.ecommerce.model.CosmeticoModel;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProdutosBD {
    List<CosmeticoModel> cosmeticos = new ArrayList<>();

    public List<CosmeticoModel> findAll() {
        return this.cosmeticos;
    }

    public void adicionar(CosmeticoModel cosmetico) {
        this.cosmeticos.add(cosmetico);
    }

    public void deletar(CosmeticoModel cosmetico) {
        this.cosmeticos.remove(cosmetico);
    }
}
