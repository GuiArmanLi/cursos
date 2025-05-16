public class Ex35 {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5, 6, 8, 9, 10 };

        for (int i = 1; i <= a.length; i++) {
            System.out.println("\nDivisores de " + i);

            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    System.out.print(j + "\t");
                }
            }
        }
    }
}
