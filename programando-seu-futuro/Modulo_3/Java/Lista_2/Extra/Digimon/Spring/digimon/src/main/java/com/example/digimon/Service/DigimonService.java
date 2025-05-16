package com.example.digimon.service;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.example.digimon.model.Digimon;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class DigimonService {
    private static final String PATH_URL = "https://digimon-api.vercel.app/api/digimon";
    private static final String PATH_FILE = "src\\\\main\\\\java\\\\com\\\\example\\\\digimon\\\\db\\\\digimons.json";

    public List<Digimon> getAll() {
        String response = getDigimons();

        writeResponseToFile(response);

        return fileToListDigimons();
    }

    private String getDigimons() {
        RestTemplate rt = new RestTemplate();
        return rt.getForEntity(PATH_URL, String.class).getBody();
    }

    private void writeResponseToFile(String response) {
        Path path = Path.of(PATH_FILE);
        if (!Files.exists(path)) {
            createFile(path);
        }

        try (FileWriter fw = new FileWriter(path.toFile())) {
            fw.write(response);
        } catch (IOException error) {
            Logger.getLogger("Logger").warning(error.getMessage());
        }
    }

    private void createFile(Path path) {
        try {
            Files.createFile(path);
        } catch (IOException error) {
            Logger.getLogger("Logger").warning(error.getMessage());
        }
    }

    private List<Digimon> fileToListDigimons() {
        try {
            ObjectMapper om = new ObjectMapper();
            return om.readValue(Path.of(PATH_FILE).toFile(),
                    new TypeReference<List<Digimon>>() {
                    });
        } catch (RestClientException error) {
            Logger.getLogger(error.getMessage());
        } catch (IOException error) {
            Logger.getLogger("Logger").warning(error.getMessage());
        }
        
        return Collections.emptyList();
    }
}
