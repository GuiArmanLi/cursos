import java.util.Scanner;

class Ex5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com duas notas de uma aluno");
		double note1 = scan.nextDouble();
		double note2 = scan.nextDouble();
		double average = (note1 + note2) / 2;

		if (average == 10) {
			System.out.println("Aprovado com Distincao");
		} else if (average >= 7) {
			System.out.println("Aprovado");
		} else {
			System.out.println("Reprovado");
		}
		scan.close();
	}
}