public class Ex15 {
    public static void main(String[] args) {
        double[] a = { 1, 2, 3, 4, 5, 5, 5, 5, 6, 7, 8, 9, 10 };

        var quantityEven = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                quantityEven++;
            }
        }

        var oddPercent = quantityEven * 100 / a.length;
        var evenPercent = 100 - oddPercent;

        System.out.println("Porcentagem de numeros pares: " + oddPercent + "%");
        System.out.println("Porcentagem de numeros impares: " + evenPercent + "%");
    }
}
