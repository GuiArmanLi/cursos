package com.example.endereco.service;

import com.example.endereco.model.Endereco;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Logger;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

@Service
public class EnderecoService {
    public ResponseEntity<Endereco> findByCep(String cep) {
        RestTemplate rt = new RestTemplate();
        ResponseEntity<Endereco> endereco = null;

        try {
            URI path = new URI("https://viacep.com.br/ws/" + cep + "/json/");
            endereco = rt.getForEntity(path, Endereco.class);

        } catch (RestClientException | URISyntaxException error) {
            Logger.getLogger("Logger").warning(error.getMessage());
        }

        return endereco;
    }
}
