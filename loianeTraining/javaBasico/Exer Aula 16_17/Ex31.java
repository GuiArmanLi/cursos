import java.util.Scanner;

public class Ex31 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o preco dos produtos e \"0\" para indicar o final das compras");

        double product = 1;
        double totalValueProducts = 0;
        for (int i = 0; product != 0; i++) {
            System.out.print("Produto " + (i + 1) + ": R$ ");
            product = scan.nextDouble();
            totalValueProducts += product;
        }
        System.out.println("Total: R$ " + totalValueProducts);

        System.out.print("Dinhiero: ");
        var payment = scan.nextDouble();

        var change = totalValueProducts - payment;
        if (change <= 0) {
            System.out.println("Troco: R$ " + Math.abs(change));
        } else {
            System.out.println("Esta devendo. Precisa de mais " + (totalValueProducts - payment));
        }
        scan.close();
    }
}
