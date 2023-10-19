import java.util.Scanner;

class Ex12 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o valor do Salario Bruto");
		double grossSalary = scan.nextDouble();

		int porcentIR = 0;
		double irValue = 0;

		double syndicate = grossSalary * 0.03;
		double inss = grossSalary * 0.1;
		double fgtsValue = grossSalary * 0.11;

		if (grossSalary > 900 && grossSalary <= 1500) {
			porcentIR = 5;
			irValue = grossSalary * porcentIR / 100;
		} else if (grossSalary > 1500 && grossSalary <= 2500) {
			porcentIR = 10;
			irValue = grossSalary * (porcentIR / 100);
		} else {
			porcentIR = 20;
			irValue = grossSalary * (porcentIR / 100);
		}

		double totalDiscount = irValue + inss + syndicate;
		double netSalary = grossSalary - totalDiscount;

		System.out.println("Salario Bruto:\t: R$ " + grossSalary);
		System.out.println("(-)IR (" + porcentIR + "%)\t: R$ " + irValue);
		System.out.println("(-) INSS (10%)\t: R$ " + inss);
		System.out.println("FGTS (11%)\t: R$ " + fgtsValue);
		System.out.println("Total de desc\t: R$ " + totalDiscount);
		System.out.println("Salario Liquido\t: R$ " + netSalary);

		scan.close();
	}
}