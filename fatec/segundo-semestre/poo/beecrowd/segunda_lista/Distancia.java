
import java.util.Scanner;

public class Distancia {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        var valor = scanner.nextInt();

        var tempo = valor * 2;

        System.out.printf("%s minutos\n", tempo);
    }
}
