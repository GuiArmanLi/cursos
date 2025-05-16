
import java.util.Scanner;

public class TrocaVetor {
    public static Scanner scanner = new Scanner(System.in);
    public static final int TAMANHO_VETOR = 20;

    public static void main(String[] args) {
        int[] vetor = new int[TAMANHO_VETOR];
        for (int desc = TAMANHO_VETOR - 1; desc >= 0; desc--) {
            vetor[desc] = scanner.nextInt();
        }

        for (int cres = 0; cres < vetor.length; cres++) {
            System.out.printf("N[%s] = %s\n", cres, vetor[cres]);
        }
    }
}
