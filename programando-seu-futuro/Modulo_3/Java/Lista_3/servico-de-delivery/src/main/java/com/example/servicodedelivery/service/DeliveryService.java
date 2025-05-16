package com.example.servicodedelivery.service;

import com.example.servicodedelivery.envio.FormaDeEnvio;
import com.example.servicodedelivery.model.ProdutoModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class DeliveryService {
    @Autowired
    @Qualifier("ViaMoto")
    private FormaDeEnvio formaDeEnvio;

    public void enviar(ProdutoModel produto) {
        this.formaDeEnvio.enviar(produto);
    }
}
