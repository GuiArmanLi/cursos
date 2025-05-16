
import java.io.IOException;
import java.util.Scanner;

public class CalculoSimples {

    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        var codigo1 = scan.nextInt();
        var numeroPecas1 = scan.nextInt();
        var valorPeca1 = scan.nextDouble();

        var codigo2 = scan.nextInt();
        var numeroPecas2 = scan.nextInt();
        var valorPeca2 = scan.nextDouble();

        var total = numeroPecas1 * valorPeca1 + numeroPecas2 * valorPeca2;

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
    }
}
