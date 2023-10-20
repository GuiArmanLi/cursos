import java.util.Scanner;

public class Ex40 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        var veiculosDePasseio = 0;
        var numeroDeAcidentes = 0;

        var somaDeVeiculos = 0;

        var menorIndiceDeAcidentes = 999;
        var cidadeComMaisAcidentes = 0;
        var maiorIndiceDeAcidentes = 0;
        var cidadeComMenosAcidentes = 0;

        var somaRestringida = 0;
        var quantidadeRestringida = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite as informacoes da cidade " + (i + 1));

            System.out.println("Numero de veiculos de passeio");
            veiculosDePasseio = scan.nextInt();

            System.out.println("Numero de acidentes de transito com vitimas");
            numeroDeAcidentes = scan.nextInt();

            if (numeroDeAcidentes > maiorIndiceDeAcidentes) {
                maiorIndiceDeAcidentes = numeroDeAcidentes;
                cidadeComMaisAcidentes = i + 1;
            }

            if (numeroDeAcidentes < menorIndiceDeAcidentes) {
                menorIndiceDeAcidentes = numeroDeAcidentes;
                cidadeComMenosAcidentes = i + 1;
            }

            if (numeroDeAcidentes < 2000) {
                somaRestringida += numeroDeAcidentes;
                quantidadeRestringida++;
            }

            somaDeVeiculos += veiculosDePasseio;
        }
        var mediaDeVeiculos = somaDeVeiculos / 5;
        var mediaRestringida = somaRestringida / quantidadeRestringida;

        System.out.println("Maior numero de acidentes pertence a cidade " + cidadeComMaisAcidentes);
        System.out.println("Menor numero de acidentes pertence a cidade " + cidadeComMenosAcidentes);
        System.out.println("Media de veiculos nas cidade: " + mediaDeVeiculos);
        System.out.println("Media de acidentes das cidades com menos de 2000 acidentes: " + mediaRestringida);
        scan.close();
    }
}
