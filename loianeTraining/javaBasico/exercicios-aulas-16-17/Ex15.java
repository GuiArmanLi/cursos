import java.util.Scanner;

public class Ex15 {
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
        }
        scan.close();
    }
}
