import java.util.Scanner;

public class Ex32 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um numero");
        var number = scan.nextInt();

        System.out.println("Fatorial de " + number);
        var factorial = 1;
        System.out.print(number + "! = ");
        for (int i = number; i > 0; i--) {
            factorial *= i;
            if (i == 1) {
                System.out.print(i);
            } else {
                System.out.print(i + " . ");
            }
        }

        System.out.println(" = " + factorial);
        scan.close();
    }
}
