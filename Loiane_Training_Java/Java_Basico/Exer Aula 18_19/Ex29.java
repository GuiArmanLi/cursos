public class Ex29 {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] b = { 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
        int[] c = new int[20];

        for (int i = 0; i < c.length; i++) {
            if (i < 10) {
                c[i] = a[i];
            } else if (i >= 10) {
                c[i] = b[i - 10];
            }
            System.out.println(c[i]);
        }
    }
}
