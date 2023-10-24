import java.util.Scanner;

class Ex17 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite a area que deseja pintar");
		int areaToPaint = scan.nextInt();

		int bigCans = 0;
		int smallCans = 0;

		if (areaToPaint % 18 == 0) {
			bigCans = areaToPaint / 18;

			System.out.println("Precisa de " + bigCans + " lata(s) grandes.");
			System.out.println("Total: R$ " + bigCans * 80);
		} else if (areaToPaint % 18 < 11) {
			bigCans = areaToPaint / 18;
			smallCans = (int) ((double) (areaToPaint % 18 / 3.6) + 1);
			int valorTotal = (bigCans * 80) + (smallCans * 25);

			System.out.println("Precisa de " + bigCans + " lata(s) grandes e " + smallCans + " lata(s) pequenas.");
			System.out.println("Total: R$ " + valorTotal);
		} else {
			bigCans = (areaToPaint / 18) + 1;

			System.out.println("Precisa de " + bigCans + " lata(s)");
			System.out.println("totalizando um valor de R$ " + bigCans * 80);
		}
		scan.close();
	}
}