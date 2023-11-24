public class Ex36 {
    public static void main(String[] args) {
        double[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };

        for (int i = 0; i < a.length; i++) {
            a[i] = Math.pow(2, i);
            System.out.println(a[i]);
        }
    }
}
