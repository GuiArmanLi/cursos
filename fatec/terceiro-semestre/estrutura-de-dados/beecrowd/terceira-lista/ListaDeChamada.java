import java.util.ArrayList;
import java.util.Scanner;

public class ListaDeChamada {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        var numeroDeAlunos = scanner.nextInt();
        var sorteado = scanner.nextInt();
        scanner.nextLine();
        var alunos = new ArrayList<>();
        for (int i = 0; i < numeroDeAlunos; i++) {
            var nomeAluno = scanner.nextLine();
            alunos.add(nomeAluno);
        }

        alunos.sort(null);
        System.out.println(alunos.get(sorteado - 1));
    }

}