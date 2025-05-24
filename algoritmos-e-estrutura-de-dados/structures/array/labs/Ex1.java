package structures.array.labs;

import structures.array.Array;

public class Ex1 {
    public static void main(String[] args) {
        var array = new Array<Integer>();
        array.add(3);

        System.out.printf("Array contém valor 1? %s\n", array.contains(1));
        System.out.printf("Array contém valor 3? %s", array.contains(3));
    }
}
