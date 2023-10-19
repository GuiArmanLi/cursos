import java.util.Scanner;

public class Ex21 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um numero");
        var number = scan.nextInt();

        var score = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                score++;
            }
        }
        if (score == 2) {
            System.out.println("O numero digitado e primo");
        } else {
            System.out.println("Nao e primo");
        }
        scan.close();
    }
}
