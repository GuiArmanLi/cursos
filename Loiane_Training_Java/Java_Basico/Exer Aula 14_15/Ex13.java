import java.util.Scanner;

class Ex13 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite um numero entre 1 e 7");
		int dayWeek = scan.nextInt();

		String day = "";
		switch (dayWeek) {
			case 1:
				day = "Domingo";
				break;
			case 2:
				day = "Segunda";
				break;
			case 3:
				day = "Terca";
				break;
			case 4:
				day = "Quarta";
				break;
			case 5:
				day = "Quinta";
				break;
			case 6:
				day = "Sexta";
				break;
			case 7:
				day = "Sabado";
				break;
			default:
				day = "uma entrada incorreta";
		}

		System.out.println("O dia da semana digitada corresponde a " + day);
		scan.close();
	}
}