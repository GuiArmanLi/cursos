import java.util.Scanner;

public class SubstituicaoVetor {
    public static Scanner scanner = new Scanner(System.in);
    public static final int TAMANHO_VETOR = 10;

    public static void main(String[] args) {
        int[] vetor = new int[TAMANHO_VETOR];
        for (int i = 0; i < TAMANHO_VETOR; i++) {
            var numero = scanner.nextInt();
            if (numero <= 0) {
                vetor[i] = 1;
            } else {
                vetor[i] = numero;
            }
        }

        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("X[%s] = %s\n", i, vetor[i]);
        }
    }
}
