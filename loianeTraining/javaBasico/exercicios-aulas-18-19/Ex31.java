import java.util.ArrayList;

public class Ex31 {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
        ArrayList<Integer> evenAndOdd = new ArrayList<Integer>();

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                evenAndOdd.add(a[i]);
            }
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                evenAndOdd.add(a[i]);
            }
        }

        for (int i = 0; i < evenAndOdd.size(); i++) {
            System.out.print(evenAndOdd.get(i) + "\t");
        }
    }
}
