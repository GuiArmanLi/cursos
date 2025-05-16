import java.time.LocalDate;
import java.util.Scanner;

public class App {
    private static final Scanner SCAN = new Scanner(System.in);
    private static final Integer ANO_ATUAL = LocalDate.now().getYear();

    public static void main(String[] args) {
        System.out.println(String.format("O usuário terá %s anos até o final de %s",
                calcularIdade(), ANO_ATUAL));

        SCAN.close();
    }

    private static int calcularIdade() {
        System.out.print("Digite seu data de nascimento: ");
        var anoDataDeNascimento = SCAN.nextInt();

        return ANO_ATUAL - anoDataDeNascimento;
    }
}