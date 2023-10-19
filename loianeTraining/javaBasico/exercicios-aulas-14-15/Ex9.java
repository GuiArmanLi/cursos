import java.util.Scanner;

class Ex9 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite 3 numeros");
		int number1 = scan.nextInt();
		int number2 = scan.nextInt();
		int number3 = scan.nextInt();

		int higherNumber = 0;
		int smallestNumber = 0;
		int midlleNumber = 0;

		if (number1 > number2 && number1 > number3) {
			higherNumber = number1;
			if (number2 > number3) {
				midlleNumber = number2;
				smallestNumber = number3;
			} else {
				midlleNumber = number3;
				smallestNumber = number2;
			}
		} else if (number2 > number1 && number2 > number3) {
			higherNumber = number2;
			if (number1 > number3) {
				midlleNumber = number1;
				smallestNumber = number3;
			} else {
				midlleNumber = number3;
				smallestNumber = number1;
			}
		} else {
			higherNumber = number3;
			if (number1 > number2) {
				midlleNumber = number1;
				smallestNumber = number2;
			} else {
				midlleNumber = number2;
				smallestNumber = number1;
			}
		}
		System.out.println("Maior numero: " + higherNumber);
		System.out.println("Numero do meio: " + midlleNumber);
		System.out.println("Menor numero: " + smallestNumber);
		scan.close();
	}
}