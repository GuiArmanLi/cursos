public class Ex33 {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5, 6, 8, 9, 10 };

        for (int i = 1; i <= a.length; i++) {
            var prime = true;
            for (int j = 2; j < i; j++) {
                if (a[i] % j == 0) {
                    prime = false;
                    break;
                }

            }
            if (prime) {
                System.out.println(i + "\tPrimo");
            } else {
                System.out.println(i + "\tNao Primo");
            }
        }
    }
}
