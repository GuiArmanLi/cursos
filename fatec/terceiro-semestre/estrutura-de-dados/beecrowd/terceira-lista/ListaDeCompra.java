import java.util.Scanner;
import java.util.TreeSet;

public class ListaDeCompra {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        var numeroDeAnotacoes = scanner.nextInt();

        scanner.nextLine();
        String[] lista = new String[numeroDeAnotacoes];
        for (int i = 0; i < numeroDeAnotacoes; i++) {
            var linha = scanner.nextLine();
            var itens = linha.split(" ");

            TreeSet<String> set = new TreeSet<>();
            for (String item : itens) {
                set.add(item);
            }

            lista[i] = String.join(" ", set);
        }

        for (int i = 0; i < numeroDeAnotacoes; i++) {
            System.out.println(lista[i]);
        }
    }
}
