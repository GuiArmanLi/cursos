import java.util.Scanner;

class Ex8 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Quanto voce ganha por Hora?");
		double salaryPerHour = scan.nextDouble();

		System.out.println("Quantas horas voce trabalha por mes?");
		double workedHours = scan.nextDouble();

		System.out.println("O salario de acordo com os dados informados e: " + salaryPerHour * workedHours);

		scan.close();
	}
}