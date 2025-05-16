public class Ex7 {
    public static void main(String[] args) {
        int[] a = { 1, 3, 9, 8, 9, 11, 13, 27, 17, 19 };
        int[] b = { 6, 2, 3, 6, 8, 26, 12, 14, 16, 18 };
        int[] c = new int[10];

        for (int i = 0; i < a.length; i++) {
            c[i] = a[i] - b[i];
            System.out.println(c[i] + " = " + a[i] + " - " + b[i]);
        }
    }
}
