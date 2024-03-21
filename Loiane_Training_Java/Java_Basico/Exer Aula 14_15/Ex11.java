import java.util.Scanner;

class Ex11 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o salario do colaborador");
		double salary = scan.nextDouble();

		System.out.println("O salario antes do reajuste: R$" + salary);

		int increasePercent = 0;
		double increaseValue = 0;
		if (salary <= 280) {
			increaseValue = (salary * 1.2) - salary;
			salary *= 1.2;
			increasePercent = 20;
		} else if (salary > 280 && salary < 700) {
			increaseValue = (salary * 1.15) - salary;
			salary *= 1.15;
			increasePercent = 15;
		} else if (salary > 700 && salary < 1500) {
			increaseValue = (salary * 1.1) - salary;
			salary *= 1.1;
			increasePercent = 10;
		} else {
			increaseValue = (salary * 1.05) - salary;
			salary *= 1.05;
			increasePercent = 5;
		}

		System.out.println("Percentual do reajuste: " + increasePercent + "%");
		System.out.println("Percentual de aumento aplicado: " + increaseValue);
		System.out.println("Valor do aumento: R$" + salary);

		scan.close();
	}
}