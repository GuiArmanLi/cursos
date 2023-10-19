import java.util.Scanner;

class Ex2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite um numero");
		int number = scan.nextInt();

		if (number > 0) {
			System.out.println("Positivo!");
		} else if (number == 0) {
			System.out.println("Neutro!");
		} else {
			System.out.println("Negativo!");
		}
		scan.close();
	}
}