public class Ex11 {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        var quantityEven = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                quantityEven++;
            }
        }
        System.out.println("Quantidade de pares: " + quantityEven);
    }
}
