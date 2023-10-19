import java.util.Scanner;

class Ex4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite apenas um caracter");
		String character = scan.next();

		if (character.equalsIgnoreCase("a") ||
			character.equalsIgnoreCase("e") ||
			character.equalsIgnoreCase("i") ||
			character.equalsIgnoreCase("o") ||
			character.equalsIgnoreCase("u")) {
			System.out.println("Vogal");
		} else {
			System.out.println("Consoante");
		}
		scan.close();
	}
}