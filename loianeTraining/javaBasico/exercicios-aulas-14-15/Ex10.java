import java.util.Scanner;

class Ex10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Selecione o periodo do dia de acordo com os formatos a seguir");
		System.out.println("\"M\" - Matutino | \"V\" - Vespertino | \"N\" - Noturno.");
		String dayPeriod = scan.next();

		if (dayPeriod.equalsIgnoreCase("M")) {
			System.out.println("Bom dia");
		} else if (dayPeriod.equals("V")) {
			System.out.println("Boa tarde");
		} else if (dayPeriod.equals("N")) {
			System.out.println("Boa noite");
		} else {
			System.out.println("Formato invalido!");
		}
		scan.close();
	}
}