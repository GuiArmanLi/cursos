import java.util.Scanner;

public class Ex23 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um numero");
        var number = scan.nextDouble();

        if ((int) number == number) {
            System.out.println("Inteiro");
        } else {
            System.out.println("Decimal");
        }
        scan.close();
    }
}
