import java.util.Scanner;

class Ex11 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com 2 numeros inteiros e 1 numero real.");
		int numero1 = scan.nextInt();
		int numero2 = scan.nextInt();
		double numero3 = scan.nextDouble();

		System.out.println((numero1 * 2) * (numero2 * 0.5));
		System.out.println((numero1 * 3) + numero3);
		System.out.println(Math.pow(numero3, 3));

		scan.close();
	}
}