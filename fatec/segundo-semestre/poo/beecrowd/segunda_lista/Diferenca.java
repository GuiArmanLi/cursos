
import java.util.Scanner;

public class Diferenca {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        var a = scanner.nextInt();
        var b = scanner.nextInt();
        var c = scanner.nextInt();
        var d = scanner.nextInt();

        var diferenca = (a * b - c * d);

        System.out.printf("DIFERENCA = %s\n", diferenca);
    }
}
