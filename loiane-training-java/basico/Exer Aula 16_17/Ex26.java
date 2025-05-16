import java.util.Scanner;

public class Ex26 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Quantas pessoas irao votar?");
        var voters = scan.nextInt();

        var vote = 0;
        var candidateCovas = 0;
        var candidateBolsonaro = 0;
        var candidateLula = 0;
        for (int i = 0; i < voters; i++) {
            System.out.println("Eleitor " + (i + 1) + " realize seu voto");
            System.out.println("\"1\" - Covas | \"2\" - Bolsonaro | \"3\" - Lula");
            vote = scan.nextInt();

            if (vote == 1) {
                candidateCovas++;
            } else if (vote == 2) {
                candidateBolsonaro++;
            } else if (vote == 3) {
                candidateLula++;
            } else {
                System.out.println("Opcao invalida. Tenta novamente");
                i--;
            }
        }

        System.out.println("Covas teve " + candidateCovas + " votos");
        System.out.println("Bolsonaro teve " + candidateBolsonaro + " votos");
        System.out.println("Lula teve " + candidateLula + " votos");
        scan.close();
    }
}
