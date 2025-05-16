public class Ex27 {
    public static void main(String[] args) {
        int[] a = { 1, 2, 4, 7, 8, 10, 16, 8, 9, 10 };
        char[] b = new char[10];

        for (int i = 0; i < b.length; i++) {
            if (a[i] < 7) {
                b[i] = 'a';
            } else if (a[i] == 7) {
                b[i] = 'b';
            } else if (a[i] > 7 && a[i] < 10) {
                b[i] = 'c';
            } else if (a[i] == 10) {
                b[i] = 'd';
            } else {
                b[i] = 'e';
            }
            System.out.println(b[i]);
        }
    }
}
