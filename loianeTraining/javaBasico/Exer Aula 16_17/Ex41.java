import java.util.Scanner;

public class Ex41 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor da divida");
        var debt = scan.nextInt();

        int[] installments = { 1, 3, 6, 9, 12 };
        double[] fees = { 1, 1.1, 1.15, 1.2, 1.25 };
        var totalDebt = 0.0;
        System.out.println("Valor da Divida \t| Valor dos Juros \t| Quantidade de Parcelas \t| Valor da Parcela");
        for (int i = 0; i < 5; i++) {
            totalDebt = debt * fees[i];
            System.out.print("R$ " + (int) totalDebt + "\t\t\t");
            System.out.print((totalDebt - debt) + "\t\t\t");
            System.out.print(installments[i] + "\t\t\t\t");
            System.out.println("R$ " + totalDebt / installments[i] + "\n\n");
        }
        scan.close();
    }
}
