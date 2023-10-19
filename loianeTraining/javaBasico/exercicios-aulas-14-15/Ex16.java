import java.util.Scanner;
import java.lang.Math;

class Ex16 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o as variaveis A, B e C para calcular um equacao quadrada.");
		double a = scan.nextDouble();
		if (a == 0) {
			System.out.println("A equacao nao e de segundo grau");
			scan.close();
			return;
		}
		
		double b = scan.nextDouble();
		double c = scan.nextDouble();

		double delta = Math.pow(b, 2) - (4 * a * c);
		System.out.println("Delta = " + delta);

		if (delta < 0) {
			System.out.println("A equacao nao possui raizes reais");
		} else if (delta == 0) {
			double x1 = (-b + Math.sqrt(delta)) / (2 * a);
			System.out.println("A equacao possui apenas uma raiz real " + x1);
		} else {
			double x1 = (-b + Math.sqrt(delta)) / (2 * a);
			double x2 = (-b - Math.sqrt(delta)) / (2 * a);
			System.out.println("A equacao possui 2 raizes reais " + x1 + " | " + x2);
		}
		scan.close();
	}
}