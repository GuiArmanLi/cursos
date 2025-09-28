import java.io.IOException;
import java.util.Scanner;

public class ImpostoDeRenda {
    private static Scanner scanner = new Scanner(System.in);
 
    public static void main(String[] args) throws IOException {
        double salario = scanner.nextDouble();
        double imposto = 0.0;

        if (salario <= 2000.0) {
            System.out.println("Isento");
        } else {
            if (salario > 2000.0 && salario <= 3000.0) {
                imposto += (salario - 2000.0) * 0.08;
            } else if (salario > 3000.0 && salario <= 4500.0) {
                imposto += (1000.0 * 0.08);
                imposto += (salario - 3000.0) * 0.18;
            } else {
                imposto += (1000.0 * 0.08);
                imposto += (1500.0 * 0.18);
                imposto += (salario - 4500.0) * 0.28;
            }

            System.out.printf("R$ %.2f\n", imposto);
        }

        scanner.close();
    }
 
}