package Vetor;

import java.util.Arrays;
import java.util.List;

public class Vetor {

    public String[] elementos;

    public Vetor() {
    }

    public Vetor(int tamanho) {
        this.elementos = new String[tamanho];
    }

    public void add(String elemento) {
        this.elementos[elementos.length - 1] = elemento;
    }

    public int size() {
        return elementos.length;
    }

    @Override
    public String toString() {
        return "Vetor [elementos=" + Arrays.toString(elementos) + "]";
    }
}