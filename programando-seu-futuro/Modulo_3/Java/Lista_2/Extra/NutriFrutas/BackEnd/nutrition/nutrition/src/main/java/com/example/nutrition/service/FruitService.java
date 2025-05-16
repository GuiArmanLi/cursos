package com.example.nutrition.service;

import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.nutrition.model.FruitModel;

@Service
public class FruitService {
    private static final String FRUIT_URL = "https://www.fruityvice.com/api/fruit/";

    public List<FruitModel> getAll() {
        RestTemplate rt = new RestTemplate();

        ResponseEntity<List<FruitModel>> fruits = rt.exchange(FRUIT_URL + "all",
                HttpMethod.GET, null,
                new ParameterizedTypeReference<List<FruitModel>>() {
                });

        return fruits.getBody();
    }

    public FruitModel getByName(String name) {
        RestTemplate rt = new RestTemplate();

        FruitModel fruit = null;
        fruit = rt.getForObject(FRUIT_URL + name, FruitModel.class);

        return fruit;
    }

    // public void addFruit(FruitModel newFruit) {
    // RestTemplate rt = new RestTemplate();

    // rt.put(FRUIT_URL + newFruit.getName(), newFruit);

    // try {
    // FruitModel fruit = null;
    // fruit = rt.getForObject(FRUIT_URL, FruitModel.class);

    // if (fruit != null) {
    // if (fruit.getName().equalsIgnoreCase(newFruit.getName())
    // && fruit.getFamily().equalsIgnoreCase(newFruit.getFamily())) {
    // Logger.getLogger("STATUS" + HttpURLConnection.HTTP_OK).info("Segura os cara.
    // Vapo!!!");
    // } else {
    // Logger.getLogger("STATUS" + HttpURLConnection.HTTP_BAD_REQUEST).info("Vixi
    // familia, deu ruim!!!");
    // }
    // }
    // } catch (HttpClientErrorException error) {
    // Logger.getLogger("Error").warning(error.getMessage());
    // }
    // }
}
