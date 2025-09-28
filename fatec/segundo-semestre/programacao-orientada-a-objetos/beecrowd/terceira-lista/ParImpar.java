import java.io.IOException;
import java.util.Scanner;

public class ParImpar {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int N = scanner.nextInt();

        for (int i = 0; i < N; i++) {
            int X = scanner.nextInt();

            if (X == 0) {
                System.out.println("NULL");
            } else {
                String tipo = (X % 2 == 0) ? "EVEN" : "ODD";
                String sinal = (X > 0) ? "POSITIVE" : "NEGATIVE";
                System.out.println(tipo + " " + sinal);
            }
        }

        scanner.close();
    }
}
