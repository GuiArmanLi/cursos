public class Ex23 {
    public static void main(String[] args) {
        int[] a = { 2, 4, 6, 8, 2, 12, 14, 16, 18, 1 };

        var cont = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                cont++;
            }
            if (cont != i) {
                System.out.println("Numero impar detectado");
                break;
            }
        }
    }
}
