public class Ex26 {
    public static void main(String[] args) {
        int[] a = { 1, 2, 7, 4, 5, 6, 7, 8, 9, 10 };
        int[] b = { 10, 9, 7, 7, 6, 5, 3, 3, 2, 1 };
        int[] c = new int[10];

        for (int i = 0; i < c.length; i++) {
            if (a[i] > b[i]) {
                c[i] = 1;
            } else if (a[i] == b[i]) {
                c[i] = 0;
            } else {
                c[i] = -1;
            }
            System.out.println(c[i]);
        }
    }
}
