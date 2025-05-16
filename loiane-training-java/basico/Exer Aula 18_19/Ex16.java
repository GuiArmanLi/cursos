import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Ex16 {
    public static void main(String[] args) {
        NumberFormat format = new DecimalFormat("#0.00");
        int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 15, 20, 21 };

        var sumSmaller = 0;
        var sumHigher = 0;
        var contHigher = 0.1;
        var equalANumber = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 15) {
                sumHigher += a[i];
                contHigher++;
            }
            if (a[i] < 15) {
                sumSmaller += a[i];
            }
            if (a[i] == 15) {
                equalANumber++;
            }
        }

        System.out.println("Soma dos numeros menores que 15:\t" + format.format(sumSmaller));
        System.out.println("Quantidade de numeros iguais a 15:\t" + format.format(equalANumber));
        System.out.println("Media dos numeros superiores a 15:\t" + format.format(sumHigher / contHigher));
    }
}
