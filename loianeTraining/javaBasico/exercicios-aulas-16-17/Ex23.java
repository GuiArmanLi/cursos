import java.util.Scanner;

public class Ex23 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um numero");
        var number = scan.nextInt();

        for (int i = 1; i <= number; i++) {
            // System.out.println("\n\nI = " + i);

            int score = 0;
            int quantityOfDivisions = 0;
            for (int j = 1; j <= i; j++) {
                // System.out.print("J = " + j + " ");
                if (i % j == 0) {
                    score++;
                }
                quantityOfDivisions++;
            }
            // System.out.print(" | Score: " + score);
            if (score == 2) {
                System.out.println(i + " = Primo | Divisoes = " + quantityOfDivisions);
            }
        }
        scan.close();
    }
}
