import java.util.Scanner;

class Ex7 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o lado do quadrado.");
		double side = scan.nextDouble();

		double areaOfTheSquare = Math.pow(side, 2);

		System.out.println("A area do quadrado e: " + areaOfTheSquare);
		System.out.println("O dobro da area do quadrado e: " + areaOfTheSquare * 2);

		scan.close();
	}
}