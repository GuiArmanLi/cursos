import java.util.Scanner;

public class Ex35 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um numero");
        var number = scan.nextInt();

        for (int i = 1; i <= number; i++) {
            int score = 0;

            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    score++;
                }
            }

            if (score == 2) {
                System.out.println(i + " = Primo");
            }
        }
        scan.close();
    }
}
