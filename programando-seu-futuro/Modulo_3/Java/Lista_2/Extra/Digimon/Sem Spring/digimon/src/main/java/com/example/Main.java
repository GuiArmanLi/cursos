package com.example;

import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.logging.Logger;
import java.net.HttpURLConnection;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

import com.example.Model.Digimon;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
    private static final String PATH_FILE = "digimon\\src\\main\\resources\\digimons.json";
    private static final String PATH_URL = "https://digimon-api.vercel.app/api/digimon";

    public static void main(String[] args) {
        getAll();
    }

    private static void getAll() {
        String request = getResquest();
        if (request == null) {
            Logger.getLogger("Logger").warning("Erro!");
        }

        requestToFile(request);

        List<Digimon> digimons = fileToListDigimons();
        for (Digimon digimon : digimons) {
            Logger.getLogger("Logger").info("Nome: " + digimon.getName() + ", Level: " + digimon.getLevel());
        }
    }

    private static String getResquest() {
        try {
            URL url = new URL(PATH_URL);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            connection.setRequestMethod("GET");

            int responseCode = connection.getResponseCode();
            if (HttpURLConnection.HTTP_OK == responseCode) {
                BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String aux = "";

                StringBuffer response = new StringBuffer();
                while ((aux = reader.readLine()) != null) {
                    response.append(aux);
                }

                return response.toString();
            }
        } catch (IOException error) {
            Logger.getLogger("Logger").warning(error.getMessage());
        }

        return null;
    }

    private static void requestToFile(String request) {
        Path path = Path.of(PATH_FILE);
        if (!Files.exists(path)) {
            try {
                Files.createFile(path);
            } catch (IOException error) {
                Logger.getLogger("Logger").warning(error.getMessage());
            }
        }

        try (FileWriter fw = new FileWriter(path.toFile())) {
            fw.append(request);
        } catch (IOException error) {
            Logger.getLogger("Logger").warning(error.getMessage());
        }
    }

    private static List<Digimon> fileToListDigimons() {
        List<Digimon> digimons = null;

        try {
            ObjectMapper objectMapper = new ObjectMapper();
            digimons = objectMapper.readValue(Path.of(PATH_FILE).toFile(),
                    new TypeReference<List<Digimon>>() {
                    });
        } catch (IOException error) {
            Logger.getLogger("Logger").warning(error.getMessage());
        }

        return digimons;
    }
}