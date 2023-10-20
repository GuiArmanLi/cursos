import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite quantos numeros deseja entrar");
        var reading = scan.nextInt();

        var number = 0;
        var sum = 0;
        var higherNumber = 0;
        for (int i = 0; i < reading; i++) {
            System.out.println("Digite um numero");
            number = scan.nextInt();

            if (number < 0 || number > 1000) {
                System.out.println("Digite apenas numero entre 0 - 1000");
                scan.close();
                break;
            }

            sum += number;
            if (number > higherNumber) {
                higherNumber = number;
            }
        }

        System.out.println("Voce digitou " + number + " numeros");
        System.out.println("Soma: " + sum);
        System.out.println("Maior numero digitado: " + higherNumber);
        scan.close();
    }
}
