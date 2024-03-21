import java.util.Scanner;

class Ex4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite 4 notas");
		int numero1 = scan.nextInt();
		int numero2 = scan.nextInt();
		int numero3 = scan.nextInt();
		int numero4 = scan.nextInt();

		int media = (numero1 + numero2 + numero3 + numero4) / 4;

		System.out.print("A media das notas e: " + media);

		scan.close();
	}
}