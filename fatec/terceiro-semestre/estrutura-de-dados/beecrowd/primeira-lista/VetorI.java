import java.util.Scanner;

public class VetorI {
    public static Scanner scanner = new Scanner(System.in);
    public static final int TAMANHO_VETOR = 10;

    public static void main(String[] args) {
        int[] vetor = new int[TAMANHO_VETOR];

        vetor[0] = scanner.nextInt();
        for (int i = 1; i < TAMANHO_VETOR; i++) {
            vetor[i] = vetor[i - 1] * 2;
        }

        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("N[%s] = %s\n", i, vetor[i]);
        }
    }
}
