import java.util.Scanner;

class Ex12 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite a sua altura");
		double height = scan.nextDouble();

		double goodWeight = (72.7 * height) - 58;

		System.out.print("O peso ideal para " + height + "m e " + goodWeight);

		scan.close();
	}
}