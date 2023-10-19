import java.util.Scanner;

public class Ex23 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um numero");
        var number = scan.nextInt();

        for (int i = 1; i <= number; i++) {

            int quantidadeDeDivisoes = 0;
            var score = 0;
            for (int j = 1; j <= number; j++) {
                if (number % i == 0) {
                    score++;
                    quantidadeDeDivisoes++;
                }
            }
            if (score == 2) {
                System.out.println("O numero " + i + " e primo");
                System.out.println("Quantidade de divisoes: " + quantidadeDeDivisoes);
            }
        }
        scan.close();
    }
}
