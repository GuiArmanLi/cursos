public class Ex17 {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 40 };

        var cont = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 35) {
                cont++;
            }
        }

        System.out.println("Quantidade de pessoas acima de 35 anos: " + cont);
    }
}
