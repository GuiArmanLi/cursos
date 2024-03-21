import java.util.Scanner;

class Ex7 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com 3 numeros");
		int number1 = scan.nextInt();
		int numero2 = scan.nextInt();
		int number3 = scan.nextInt();

		if (number1 > numero2 && number1 > number3) {
			System.out.println("Maior numero " + number1);
		} else if (numero2 > number1 && numero2 > number3) {
			System.out.println("Maior numero " + numero2);
		} else {
			System.out.println("Maior numero " + number3);
		}

		if (number1 < numero2 && number1 < number3) {
			System.out.println("Menor numero " + number1);
		} else if (numero2 < number1 && numero2 < number3) {
			System.out.println("Menor numero " + numero2);
		} else {
			System.out.println("Menor numero " + number3);
		}
		scan.close();
	}
}