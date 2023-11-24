import java.util.Scanner;

class Ex3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite M ou F para identificar o genero");
		String gender = scan.next();
		if (gender.equalsIgnoreCase("m")) {
			System.out.println("Masculino");
		} else if (gender.equalsIgnoreCase("f")) {
			System.out.println("Feminino");
		} else {
			System.out.println("Digite um formato valido");
		}
		scan.close();
	}
}