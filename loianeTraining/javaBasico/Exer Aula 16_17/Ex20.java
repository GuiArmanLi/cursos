import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean repeat = true;
        var number = 0;
        var read = "";
        while (repeat) {
            System.out.println("Digite um numero");
            number = scan.nextInt();

            var factorial = 1;
            for (int i = number; i > 0; i--) {
                factorial *= i;
            }

            System.out.println("Fatorial: " + factorial);

            System.out.println("Deseja efetuar mais um calculo fatorial? \"y\" - yes \"n\" - no");
            scan.nextLine();
            read = scan.nextLine();
            if (read.equalsIgnoreCase("y")) {
                repeat = true;
            } else {
                repeat = false;
            }
        }
        scan.close();
    }
}
