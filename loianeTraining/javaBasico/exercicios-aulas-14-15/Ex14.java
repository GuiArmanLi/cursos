import java.util.Scanner;

class Ex14 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite 2 notas do aluno para calcular a nota semestral.");
		double note1 = scan.nextDouble();
		double note2 = scan.nextDouble();
		double average = (note1 + note2) / 2;
		String concept = "";
		String result = "";

		if (average > 0 && average < 4) {
			concept = "E";
		} else if (average >= 4 && average < 6) {
			concept = "D";
		} else if (average >= 6 && average < 7.5) {
			concept = "C";
		} else if (average >= 7.5 && average < 9) {
			concept = "B";
		} else if (average >= 9 && average < 10) {
			concept = "A";
		} else {
			System.out.println("Digite uma nota valida!");
			scan.close();
			return;
		}

		switch (concept) {
			case "A":
			case "B":
			case "C":
				result = "Aprovado";
				break;
			case "D":
			case "E":
				result = "Reprovado";
				break;
		}

		System.out.println("Notas: " + note1 + " | " + note2);
		System.out.println("Media: " + average);
		System.out.println("Conceito: " + concept);
		System.out.println("Resultado: " + result);

		scan.close();
	}
}