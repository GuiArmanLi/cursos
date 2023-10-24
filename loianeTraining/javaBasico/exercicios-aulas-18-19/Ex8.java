public class Ex8 {
    public static void main(String[] args) {
        int[] a = { 1, 3, 5, 7, 9, 11, 13, 15, 17, 19 };
        int[] b = { 0, 2, 4, 6, 8, 10, 12, 14, 16, 18 };
        int[] c = new int[10];

        for (int i = 0; i < a.length; i++) {
            c[i] = a[i] * b[i];
            System.out.println(c[i] + " = " + a[i] + " * " + b[i]);
        }
    }
}
