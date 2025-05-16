import java.util.Scanner;

public class Factorial {
    public static void factorial(int number) {
        var factorial = 1;

        for (int i = number; i > 0; i--) {
            factorial *= i;
            System.out.print(i + " * ");
        }

        System.out.println("\nFatorial: " + factorial);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um numero");
        var number = scan.nextInt();

        factorial(number);

        scan.close();
    }
}
