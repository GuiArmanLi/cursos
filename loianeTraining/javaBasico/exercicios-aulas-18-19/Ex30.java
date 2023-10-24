import java.util.ArrayList;

public class Ex30 {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
        ArrayList<Integer> even = new ArrayList<Integer>();
        ArrayList<Integer> odd = new ArrayList<Integer>();

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                even.add(a[i]);
            } else {
                odd.add(a[i]);
            }
        }

        for (int i = 0; i < even.size(); i++) {
            System.out.print(even.get(i) + "\t");
        }
        System.out.println();
        for (int i = 0; i < odd.size(); i++) {
            System.out.print(odd.get(i) + "\t");
        }
    }
}
