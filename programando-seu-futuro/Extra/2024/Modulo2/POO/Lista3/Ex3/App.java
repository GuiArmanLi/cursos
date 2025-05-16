package Ex3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    private static List<String> strings = new ArrayList<>();
    private static final Integer QUANTIDADE_DE_STRINGS = 2;
    private static final Scanner SCAN = new Scanner(System.in);

    public static void main(String[] args) {
        var strings = getStrings();
        var response = compararPalavras();

        System.out.println(response);
    }

    private static List<String> getStrings() {
        for (int i = 0; i < QUANTIDADE_DE_STRINGS; i++) {
            strings.add(SCAN.nextLine());
        }

        return strings;
    }

    private static String compararPalavras() {
        Boolean stringsIguais = false;

        for (int i = 0; i < QUANTIDADE_DE_STRINGS; i++) {
            var valorAtual = strings.get(i);
            var proximoValor = strings.get(i + 1);

            if (valorAtual.equals(proximoValor)) {
                stringsIguais = true;
            } else {
                break;
            }
        }

        if (stringsIguais) {
            return "As palavras são identicas";
        } else {
            Boolean stringsIguaisComCasoSensitivo = false;

            for (int i = 0; i < QUANTIDADE_DE_STRINGS; i++) {
                var valorAtual = strings.get(i);
                var proximoValor = strings.get(i + 1);

                if (valorAtual.equals(proximoValor)) {
                    stringsIguaisComCasoSensitivo = true;
                } else {
                    break;
                }
            }
        }

        return "As palavreas são diferentes";
    }
}
