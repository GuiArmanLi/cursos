public class Ex4 {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
        double[] b = new double[15];

        for (int i = 0; i < a.length; i++) {
            b[i] = Math.sqrt(a[i]);
            System.out.println("A " + a[i] + "\t" + "B " + b[i] + "\n");
        }
    }
}
