public class Ex20 {
    public static void main(String[] args) {
        double[] dolar = new double[20];
        for (int i = 0; i < dolar.length; i++) {
            dolar[i] = 5.06 * i;
            System.out.println("R$ " + i + " = " + "U$ " + dolar[i]);
        }
    }
}
