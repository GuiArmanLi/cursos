import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        var number = 0;
        var higher = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um numero");
            number = scan.nextInt();

            if (number > higher) {
                higher = number;
            }
        }
        System.out.println("Maior numero: " + higher);
        scan.close();
    }
}
