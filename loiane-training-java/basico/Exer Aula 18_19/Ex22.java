public class Ex22 {
    public static void main(String[] args) {
        int[] a = new int[10];

        var cont = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) Math.round(Math.random());

            if (a[i] == 1) {
                cont++;
            }
        }

        System.out.println("Percentual de numeros 1 = " + cont);
        System.out.println("Percentual de numeros 0 = " + (a.length - cont));
    }
}
