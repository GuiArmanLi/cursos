import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        var numero = 0;
        var quantidadeDePares = 0;
        var quantidadeDeImpares = 0;
        for (int i = 0; i < 10; i++) {
            numero = scan.nextInt();
            if (numero % 2 == 0) {
                quantidadeDePares++;
            } else {
                quantidadeDeImpares++;
            }
        }
        System.out.println("Pares: " + quantidadeDePares + " | Impares: " + quantidadeDeImpares);
        scan.close();
    }
}
