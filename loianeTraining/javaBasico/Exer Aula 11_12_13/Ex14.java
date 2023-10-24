import java.util.Scanner;

class Ex14 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Quantos quilos de peixe o Joao pescou?");
		double pesoDosPeixesPescados = scan.nextDouble();

		if (pesoDosPeixesPescados > 50) {
			int multa = (int) pesoDosPeixesPescados - 50;
			System.out.println("Multa a pagar: " + multa);
		} else {
			System.out.println("Joao nao possui multa");
		}
		scan.close();
	}
}