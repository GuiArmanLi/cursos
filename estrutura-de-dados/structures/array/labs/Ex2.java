package structures.array.labs;

import structures.array.Array;

public class Ex2 {
    public static void main(String[] args) {
        var array = new Array<Integer>();
        array.add(3);
        array.add(1);
        array.add(3);
        array.add(2);

        System.out.printf("Último index do elemento 3: %s\n", array.lastIndexOf(3));
        System.out.printf("Último index do elemento 4, que não existe, é: %s", array.lastIndexOf(4));
    }
}
