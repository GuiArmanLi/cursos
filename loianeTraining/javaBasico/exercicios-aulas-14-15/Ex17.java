import java.util.Scanner;

class Ex17 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite um ano");
		int ano = scan.nextInt();

		if (ano % 4 == 0) {
			System.out.println("Ano bissexto");
		} else {
			System.out.println("Ano nao bissexto");
		}
		scan.close();
	}
}