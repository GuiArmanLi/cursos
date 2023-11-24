import java.util.Scanner;

class Ex15 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o salario por Hora");
		double salaryPerHour = scan.nextDouble();

		System.out.println("Digite a quantidade de Horas Trabalhadas");
		int workedHours = scan.nextInt();

		double grossSalary = salaryPerHour * workedHours;
		double incomeTaxAmount = grossSalary * 0.11;
		double inssValue = grossSalary * 0.08;
		double sysdicateValue = grossSalary * 0.05;
		double netSalary = grossSalary - (incomeTaxAmount + inssValue + sysdicateValue);

		System.out.println("Salario bruto: R$" + grossSalary + "\n" +
				"INSS: R$" + inssValue + "\n" +
				"Sindicato: R$" + sysdicateValue + "\n" +
				"Salario liquido: R$" + netSalary);

		scan.close();
	}
}