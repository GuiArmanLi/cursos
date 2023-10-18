import java.util.Scanner;

class Ex9 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite uma temperatura em farenheit!");
		double farenheit = scan.nextDouble();

		double celsius = 5 * (farenheit - 32) / 9;

		System.out.println(farenheit + "F = " + celsius + "C");

		scan.close();
	}
}