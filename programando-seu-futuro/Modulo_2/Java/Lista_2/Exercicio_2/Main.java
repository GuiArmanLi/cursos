import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        final int NUMERO_HABITANTES = 4;
        int[] numeroFlhos = new int[NUMERO_HABITANTES];
        double mediaNumeroFilhos = 0.0;

        double[] salario = new double[NUMERO_HABITANTES];
        double mediaSalario = 0.0;
        double maiorSalario = 0.0;
        int percentualSalarial = 0;

        for (int i = 0; i < NUMERO_HABITANTES; i++) {
            System.out.println("Digite o salário do " + (i + 1) + "º habitante e quantos filhos ele tem!");
            salario[i] = leia.nextDouble();
            numeroFlhos[i] = leia.nextInt();

            mediaSalario += salario[i];
            mediaNumeroFilhos += numeroFlhos[i];

            if (maiorSalario < salario[i]) {
                maiorSalario = salario[i];
            }

            if (salario[i] < 1000) {
                percentualSalarial++;
            }
        }
        leia.close();

        percentualSalarial *= 100 / NUMERO_HABITANTES;
        double mediaSalarial = mediaSalario / NUMERO_HABITANTES;
        double mediaFilhosPorHabitante = mediaNumeroFilhos / NUMERO_HABITANTES;

        System.out.println("Medial salarial: " + mediaSalarial + "R$");
        System.out.println("Media do numero de filhos por habitante: " + mediaFilhosPorHabitante);
        System.out.println("Maior salario: " + maiorSalario + "R$");
        System.out.println("Percentual de pessoas com salario ate R$1000,00 é " + percentualSalarial + "%");
    }
}