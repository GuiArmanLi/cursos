class Ex1 {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5 };
        int[] b = a;

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "\t" + b[i] + "\n");
        }
    }
}