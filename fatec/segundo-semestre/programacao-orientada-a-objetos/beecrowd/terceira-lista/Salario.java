import java.io.IOException;
import java.util.Scanner;

public class Salario {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int numeroFuncionario = scanner.nextInt();
        int horasTrabalhadas = scanner.nextInt();
        double valorPorHora = scanner.nextDouble();

        double salario = horasTrabalhadas * valorPorHora;

        System.out.println("NUMBER = " + numeroFuncionario);
        System.out.printf("SALARY = U$ %.2f\n", salario);

        scanner.close();
    }
}
