class Ex24 {
    public static void main(String[] args) {
        int[] a = { 2, 3, 3, 2, 1 };

        for (int i = 0; i < a.length / 2; i++) {
            if (a[i] != a[a.length - i - 1]) {
                System.out.println("Nao e palindrometro");
                return;
            }
        }
        System.out.println("E um palindrometro");
    }
}