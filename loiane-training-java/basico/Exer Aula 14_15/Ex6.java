import java.util.Scanner;

class Ex6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com 3 numeros");
		int number1 = scan.nextInt();
		int number2 = scan.nextInt();
		int number3 = scan.nextInt();

		if (number1 > number2 && number1 > number3) {
			System.out.println("Maior numero " + number1);
		} else if (number2 > number1 && number2 > number3) {
			System.out.println("Maior numero " + number2);
		} else {
			System.out.println("Maior numero " + number3);
		}
		scan.close();
	}
}