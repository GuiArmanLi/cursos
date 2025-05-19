package structures.array.labs;

import structures.array.Array;

public class Ex5 {
    public static void main(String[] args) {
        var array = new Array<Integer>();

        array.add(1);
        array.add(2);
        array.add(3);

        System.out.printf("Array antes do método: %s\n", array);

        array.clear();
        System.out.printf("Array depois do método: %s", array);
    }
}
