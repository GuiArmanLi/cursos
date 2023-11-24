public class Ex9 {
    public static void main(String[] args) {
        int[] a = { 11, 23, 35, 47, 59, 611, 713, 815, 197, 149 };
        int[] b = { 1, 2, 4, 6, 8, 10, 12, 14, 16, 18 };
        double[] c = new double[10];

        for (int i = 0; i < a.length; i++) {
            c[i] = a[i] / b[i];
            System.out.println(c[i] + " = " + a[i] + " / " + b[i]);
        }
    }
}
