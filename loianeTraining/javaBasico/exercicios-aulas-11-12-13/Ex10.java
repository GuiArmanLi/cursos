import java.util.Scanner;

class Ex10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite um valor em celsius!");
		double celsius = scan.nextDouble();

		double farenheit = (celsius * 1.8) + 32;

		System.out.println(celsius + "C = " + farenheit + "F");

		scan.close();
	}
}