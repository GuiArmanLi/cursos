import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Digite o total da populacao do Pais A e sua taxa de crescimento");
            var populationA = scan.nextInt();
            double increaseTaxA = scan.nextDouble();
            if (populationA < 0 || increaseTaxA < 0) {
                System.out.println("Entrada Invalida");
                scan.close();
                return;
            }

            System.out.println("Digite o total da populacao do Pais B");
            var populationB = scan.nextInt();
            double increaseTaxB = scan.nextDouble();
            if (populationB < 0 || increaseTaxB < 0) {
                System.out.println("Entrada Invalida");
                scan.close();
                return;
            }

            int ano;
            for (ano = 0; populationA < populationB; ano++) {
                populationA *= increaseTaxA;
                populationB *= increaseTaxB;
            }

            System.out.println("Levou " + ano + " anos para o pais A superar o B");
            scan.close();
        }
    }
}
