import java.util.Scanner;

public class Ex28_Bonus {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println(
                "Hipermercado Tabajara esta com promocao, escolha apena um tipo de carne e leve quanto quiser");
        System.out.println("Escolha: File | Alcatra | Picanha");
        var meat = scan.nextLine();
        System.out.println("Quantos quilos deseja levar?");
        double meatKg = scan.nextDouble();

        double totalPayable = 0;
        if (meat.equalsIgnoreCase("file")) {
            if (meatKg < 5) {
                totalPayable = meatKg * 4.9;
            } else {
                totalPayable = meatKg * 5.8;
            }
        } else if (meat.equalsIgnoreCase("alcatra")) {
            if (meatKg < 5) {
                totalPayable = meatKg * 5.9;
            } else {
                totalPayable = meatKg * 6.8;
            }
        } else if (meat.equalsIgnoreCase("picanha")) {
            if (meatKg < 5) {
                totalPayable = meatKg * 6.9;
            } else {
                totalPayable = meatKg * 7.8;
            }
        } else {
            System.out.println("Digite um valor valido");
            scan.close();
            return;
        }

        String paymentByCard = "";
        System.out.println("Deseja comprar pelo cartao Tabajara?");
        System.out.println("y - Yes | n - No");
        paymentByCard = scan.next();

        double descountValue = 0;
        if (paymentByCard.equalsIgnoreCase("y")) {
            totalPayable *= 0.95;
            descountValue = totalPayable * 0.05;
            paymentByCard = "Cartao";
        } else {
            paymentByCard = "Dinheiro";
        }

        System.out.println(meat.toUpperCase() + "\nTotal: R$" + totalPayable);
        System.out.println("Tipo de pagamento " + paymentByCard);
        System.out.println("Desconto: R$" + descountValue);
        scan.close();
    }
}
