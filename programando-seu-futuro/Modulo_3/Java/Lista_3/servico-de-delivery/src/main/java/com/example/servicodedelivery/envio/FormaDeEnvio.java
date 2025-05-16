package com.example.servicodedelivery.envio;

import com.example.servicodedelivery.model.ProdutoModel;
import org.springframework.stereotype.Component;

@Component
public interface FormaDeEnvio {
    void enviar(ProdutoModel produto);
}
