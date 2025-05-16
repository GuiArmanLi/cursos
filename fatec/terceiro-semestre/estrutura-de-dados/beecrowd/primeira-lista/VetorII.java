import java.io.IOException;
import java.util.Scanner;

public class VetorII {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        var entrada = scan.nextInt();
        int[] vetor = new int[1000];

        var repeticoes = vetor.length / entrada;
        for (int i = 0, cont = 0; i < repeticoes; i++) {
            for (int j = 0; j < entrada; j++, cont++) {
                vetor[cont] = j;
            }
        }

        var resto = vetor.length % entrada;
        for (int i = 0, cont = vetor.length - resto; i < resto; i++, cont++) {
            vetor[cont] = i;
        }

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("N[" + i + "] = " + vetor[i]);
        }
    }
}