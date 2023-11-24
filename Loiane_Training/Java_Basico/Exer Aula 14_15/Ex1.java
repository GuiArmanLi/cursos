import java.util.Scanner;

class Ex1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite 2 numeros");
		int number1 = scan.nextInt();
		int number2 = scan.nextInt();

		if (number1 > number2) {
			System.out.println("O maior numero e: " + number1);
		} else {
			System.out.println("O maior numero e: " + number2);
		}
		scan.close();
	}
}