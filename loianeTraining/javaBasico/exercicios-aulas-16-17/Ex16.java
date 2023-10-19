import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Ate qual variavel deseja extender o numero de fibonacci?");
        var quantidadeDaExtensao = scan.nextInt();

        var numeroAtual = 1;
        var numeroAnterior = 0;
        for (int i = 0; i < quantidadeDaExtensao; i++) {
            System.out.print(numeroAtual + " ");
            numeroAtual = (numeroAtual + numeroAnterior);
            numeroAnterior = (numeroAtual - numeroAnterior);
            if (numeroAtual > 500) {
                System.out.println("\nProximo valor maior que 500");
                break;
            }
        }
        scan.close();
    }
}
