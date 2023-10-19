import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a base e o expoente");
        var base = scan.nextInt();
        var expoente = scan.nextInt();

        var resultado = base;
        for (int i = 0; i < expoente; i++) {
            resultado *= base;
        }

        System.out.println(resultado);
        scan.close();
    }
}
