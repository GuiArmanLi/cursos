package Ex2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    private static final Integer QUANTIDADE_DE_CRITICOS = 3;
    private static final Scanner SCAN = new Scanner(System.in);
    private static List<Integer> notas = new ArrayList<>();

    public static void main(String[] args) {
        receberNotas();
        imprimirMediaDoFilme();

        SCAN.close();
    }

    private static void receberNotas() {
        for (int i = 0; i < QUANTIDADE_DE_CRITICOS; i++) {
            System.out.print(String.format("Digite a nota do %s criticio: ", i + 1));
            var nota = SCAN.nextInt();
            notas.add(nota);
        }
    }

    private static void imprimirMediaDoFilme() {
        var soma = 0;
        for (int i = 0; i < QUANTIDADE_DE_CRITICOS; i++) {
            soma += notas.get(i);
        }

        System.out.println(String.format("Media do filme: %s", soma / notas.size()));
    }
}
