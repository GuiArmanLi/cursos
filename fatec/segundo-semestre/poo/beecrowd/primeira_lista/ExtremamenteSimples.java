
import java.io.IOException;
import java.util.Scanner;

public class ExtremamenteSimples {

    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        var a = scan.nextInt();
        var b = scan.nextInt();

        var x = soma(a, b);

        System.out.println("X = " + x);
    }

    private static int soma(int a, int b) {
        return a + b;
    }

}
