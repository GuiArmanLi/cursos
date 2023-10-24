public class Ex10 {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] b = new int[10];

        for (int i = 0; i < a.length; i++) {
            b[i] = a[i] % 2;
            System.out.println(b[i] + " = " + a[i] + " % 2");
        }
    }
}
