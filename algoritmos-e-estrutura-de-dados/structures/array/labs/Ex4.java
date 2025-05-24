package structures.array.labs;

import structures.array.Array;

public class Ex4 {
    public static void main(String[] args) throws IndexOutOfBoundsException {
        var array = new Array<Integer>();

        array.add(1);
        array.add(2);
        array.add(3);

        System.out.printf("Elemento na posição 2 é: %s\n", array.get(2));
        try {
            System.out.printf("Elemento na posição 4 é: %s", array.get(4));
        } catch (IndexOutOfBoundsException e) {
            System.out.printf("Error: %s", e.getMessage());
        }
    }
}
