import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um numero");
        var number = scan.nextInt();

        var factorial = 1;
        for (int i = number; i > 0; i--) {
            factorial *= i;
        }

        System.out.println("Fatorial: " + factorial);
        scan.close();
    }
}
