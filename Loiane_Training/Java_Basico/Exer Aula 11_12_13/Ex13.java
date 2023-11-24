import java.util.Scanner;

class Ex13 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite a sua altura");
		double height = scan.nextDouble();

		System.out.println("Digite seu peso");
		double weight = scan.nextDouble();

		System.out.println("Digite seu sexo: \"M\" ou \"F\"");
		String gender = scan.next();

		switch (gender) {
			case "M":
			case "m":
				double weightForMen = (72.7 * height) - 58;
				System.out.println("O seu peso ideal e " + weightForMen);

				if (weight > weightForMen + 10) {
					System.out.println("Voce esta acima do peso");
				} else if (weight < weightForMen - 10) {
					System.out.println("Voce esta abaixo do peso");
				} else {
					System.out.println("Voce esta dentro do peso");
				}
				break;

			case "F":
			case "f":
				double weightForWomen = (62.1 * height) - 44.7;
				System.out.println("O seu peso ideal e " + weightForWomen);

				if (weight > weightForWomen + 10) {
					System.out.println("Voce esta acima do peso");
				} else if (weight < weightForWomen - 10) {
					System.out.println("Voce esta abaixo do peso");
				} else {
					System.out.println("Voce esta dentro do peso");
				}
				break;
			default:
				System.out.println("Digite seguindo os formatos validos!");
		}
		scan.close();
	}
}