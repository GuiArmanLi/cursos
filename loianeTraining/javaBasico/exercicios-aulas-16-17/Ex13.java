import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a base e o expoente");
        var base = scan.nextInt();
        var exponent = scan.nextInt();

        var result = base;
        for (int i = 1; i < exponent; i++) {
            result *= base;
        }

        System.out.println(result);
        scan.close();
    }
}
