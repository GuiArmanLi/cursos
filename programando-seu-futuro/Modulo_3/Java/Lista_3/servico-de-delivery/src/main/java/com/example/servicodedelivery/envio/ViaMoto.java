package com.example.servicodedelivery.envio;

import com.example.servicodedelivery.model.ProdutoModel;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("ViaMoto")
public class ViaMoto implements FormaDeEnvio {
    @Override
    public void enviar(ProdutoModel produto) {
        Logger.getLogger("Logger").info(produto.getNome() + " enviado via Moto");
    }
}
