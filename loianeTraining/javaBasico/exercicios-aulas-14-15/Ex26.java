import java.util.Scanner;

public class Ex26 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o tipo de Gasolina desejada e a Quantidade de Litros para abastecer");
        System.out.println("\"A\" - Alcool | \"G\" - Gasolina");

        var fuel = scan.nextLine();
        var liters = scan.nextInt();

        double totalPayable = 0;
        if (fuel.equalsIgnoreCase("A")) {
            if (liters < 20) {
                totalPayable = (liters * 1.9) * 0.97;
            } else {
                totalPayable = (liters * 1.9) * 0.95;
            }
        } else if (fuel.equalsIgnoreCase("G")) {
            if (liters < 20) {
                totalPayable = (liters * 2.5) * 0.96;
            } else {
                totalPayable = (liters * 2.5) * 0.94;
            }
        }

        System.out.println("Total a pagar: R$" + totalPayable);
        scan.close();
    }
}
