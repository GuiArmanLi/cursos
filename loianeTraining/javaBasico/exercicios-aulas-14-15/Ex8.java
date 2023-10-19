import java.util.Scanner;

class Ex8 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com o preco de 3 produtos.");
		double product1 = scan.nextDouble();
		double product2 = scan.nextDouble();
		double product3 = scan.nextDouble();

		if (product1 < product2 && product1 < product3) {
			System.out.println("Compre o produto de R$ " + product1);
		} else if (product2 < product1 && product2 < product3) {
			System.out.println("Compre o produto de R$ " + product2);
		} else {
			System.out.println("Compre o produto de R$ " + product3);
		}
		scan.close();
	}
}