public class Ex34 {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5, 6, 8, 9, 10 };

        for (int i = 0; i < a.length; i++) {
            System.out.println("\nPares de " + 0 + " ate " + i);

            for (int j = 0; j <= i; j++) {
                if (j % 2 == 0) {
                    System.out.print(j + "\t");
                }
            }
        }
    }
}
