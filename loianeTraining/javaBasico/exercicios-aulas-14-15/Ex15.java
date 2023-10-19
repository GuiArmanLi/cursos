import java.util.Scanner;

class Ex15 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite 3 lados de um triangulo");
		double side1 = scan.nextDouble();
		double side2 = scan.nextDouble();
		double side3 = scan.nextDouble();

		if (side1 + side2 > side3 ||
			side1 + side3 > side2 ||
			side2 + side3 > side1) {

			if (side1 == side2 &&
				side1 == side3 &&
				side2 == side3) {
				System.out.println("Triangulo Equilatero");
			} else if ((side1 == side2 || side1 == side3) && 
					   (side2 == side3 || side2 == side1)) {
				System.out.println("Triangulo Isosceles");
			} else {
				System.out.println("Triangulo Escanleno");
			}
		} else {
			System.out.println("Os lado indicados nao formam um triangulo");
		}
		scan.close();
	}
}