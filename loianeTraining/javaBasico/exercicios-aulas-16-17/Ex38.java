import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.Scanner;

public class Ex38 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("###,###.##");

        System.out.println("Digite o salario do funcionario");
        var salary = scan.nextDouble();

        var currentYear = LocalDate.now().getYear();
        var increase = 1.5;
        var currentSalary = salary;
        for (int i = 1995; i < currentYear; i++) {
            System.out.println("Salario em " + i + " = " + format.format(currentSalary));
            System.out.println("Aumento de " + increase + "%\n");
            currentSalary = salary + (salary / 100) * (increase *= 2);
        }
        scan.close();
    }
}
