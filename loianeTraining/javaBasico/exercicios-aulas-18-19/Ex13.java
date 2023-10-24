public class Ex13 {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        var multipleFive = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 5 == 0) {
                multipleFive++;
            }
        }
        System.out.println("Numeros divisiveis por 5: " + multipleFive);
    }
}
