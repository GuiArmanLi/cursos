public class Ex25 {
    public static void main(String[] args) {
        int[] a = { 1, 3, 4, 6, 7, 9, 10, 12, 13, 15 };
        int[] b = new int[10];

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                b[i] = 1;
            } else {
                b[i] = 0;
            }
            System.out.println(b[i]);
        }
    }
}
