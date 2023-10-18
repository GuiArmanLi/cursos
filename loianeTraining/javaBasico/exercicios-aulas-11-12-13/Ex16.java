import java.util.Scanner;

class Ex16 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite a area que deseja pintar");
		int areaToPaint = scan.nextInt();

		int cansToBuy = 0;

		if (areaToPaint % 18 == 0) {
			cansToBuy = areaToPaint / 18;
		} else {
			cansToBuy = (areaToPaint / 18) + 1;
		}

		System.out.println("Precisa de " + cansToBuy + " latas. Total: R$ " + cansToBuy * 80);

		scan.close();
	}
}