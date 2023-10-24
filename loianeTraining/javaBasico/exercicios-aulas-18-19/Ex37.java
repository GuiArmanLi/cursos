public class Ex37 {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
        int[] b = new int[15];

        for (int i = 1; i <= b.length; i++) {

            int fatorial = 1;
            for (int j = i; j > 1; j--) {
                fatorial *= j;
            }

            b[i] = fatorial;
            System.out.println(a[i] - 1 + "\t" + b[i]);
        }
    }
}
