package structures.array.labs;

import structures.array.Array;

import java.util.ArrayList;

public class Ex3 {
    public static void main(String[] args) {
        var array = new Array<Integer>();

        array.add(1);
        array.add(2);
        array.add(3);

        //Na classe ArrayList tem sobrecarga do método remove.
        // Quando é uma lista de números, não dá pra remover o elemento porque o método entende que é um index
        array.remove(2);
        System.out.printf("Lista com o elemento 2 removido: %s\n", array);
        System.out.printf("Lista com o elemento 4, que não existe, removido: %s", array);
    }
}
