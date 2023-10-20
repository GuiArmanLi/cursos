import java.util.Scanner;

public class Ex32_Bonus {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Especificacao   \t| Codigo \t| Preco");
        System.out.println("Cachorro Quente \t 100 \t R$ 1,20");
        System.out.println("Bauru Simples   \t 101 \t R$ 1,30");
        System.out.println("Bauru com Ovo   \t 102 \t R$ 1,50");
        System.out.println("Hamburguer      \t 103 \t R$ 1,20");
        System.out.println("CheeseBurguer   \t 104 \t R$ 1,30");
        System.out.println("Refrigerante    \t 105 \t R$ 1,00");

        var code = 0;
        var totalPayment = 0.0;
        var repeat = "y";
        var quantity = 0;
        while (repeat.equalsIgnoreCase("y")) {
            System.out.println("Digite o Codigo do produto que deseja comprar");
            code = scan.nextInt();

            if (code >= 100 && code <= 105) {
                System.out.println("Deseja comprar quantos?");
                quantity = scan.nextInt();
            } else {
                System.out.println("Codigo Invalido");
            }

            if (code == 100) {
                totalPayment += (1.20 * quantity);
                System.out.println(quantity + " Cachorro Quente. Total: R$" + (1.20 * quantity));
            } else if (code == 101) {
                totalPayment += (1.30 * quantity);
                System.out.println(quantity + " Bauru Simples. Total: R$" + (1.30 * quantity));
            } else if (code == 102) {
                totalPayment += (1.50 * quantity);
                System.out.println(quantity + " Bauru com Ovo. Total: R$" + (1.50 * quantity));
            } else if (code == 103) {
                totalPayment += (1.20 * quantity);
                System.out.println(quantity + " Hamburguer. Total: R$" + (1.20 * quantity));
            } else if (code == 104) {
                totalPayment += (1.30 * quantity);
                System.out.println(quantity + " CheeseBuger. Total: R$" + (1.30 * quantity));
            } else if (code == 105) {
                totalPayment += (1.00 * quantity);
                System.out.println(quantity + " Refrigerante. Total: R$" + (1.00 * quantity));
            }

            System.out.println("Gostaria de mais algo? \"Y\" - Yes | \"N\" - No");
            repeat = scan.next();
        }

        System.out.println("Total da compra: R$" + totalPayment);
        scan.close();
    }
}
