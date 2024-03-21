import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Digite o total da populacao do Pais A e sua taxa de crescimento");
            var peopleA = scan.nextInt();
            double increaseTaxA = scan.nextDouble();

            if (peopleA < 0 || increaseTaxA < 0) {
                System.out.println("Entrada Invalida");
                scan.close();
                return;
            }

            System.out.println("Digite o total da populacao do Pais B e sua taxa de crescimento");
            var peopleB = scan.nextInt();
            double increaseTaxB = scan.nextDouble();

            if (peopleB < 0 || increaseTaxB < 0) {
                System.out.println("Entrada Invalida");
                scan.close();
                return;
            }

            int year;
            for (year = 0; peopleA < peopleB; year++) {
                peopleA *= increaseTaxA;
                peopleB *= increaseTaxB;
            }

            System.out.println("Levou " + year + " anos para o pais A superar o B");
            scan.close();
        }
    }
}
