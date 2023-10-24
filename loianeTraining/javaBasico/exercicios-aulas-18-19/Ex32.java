class Ex32 {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5 };

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j <= 10; j++) {
                System.out.println(a[i] + " x " + j + " = " + a[i] * j);
            }
            System.out.println();
        }
    }
}