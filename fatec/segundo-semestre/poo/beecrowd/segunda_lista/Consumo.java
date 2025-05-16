import java.io.IOException;
import java.util.Scanner;

public class Consumo {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException{
        var distancia = scanner.nextInt();
        var combustivel = scanner.nextDouble();

        var consumo = distancia/combustivel;

        System.out.printf("%.3f km/l\n", consumo);
    }
}
