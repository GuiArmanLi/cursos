
import java.util.Scanner;

public class Salario {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        var numeroFuncionario = scanner.nextInt();    
        var horasTrabalhadas = scanner.nextInt();    
        var salarioPorHora = scanner.nextDouble();    

        var salario = horasTrabalhadas * salarioPorHora;

        System.out.printf("NUMBER = %s\nSALARY = U$ %.2f\n", numeroFuncionario, salario);
    }
}
