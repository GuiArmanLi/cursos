import java.util.Scanner;

public class Ex27 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a quantidade(Kg), que deseja de Macas");
        double applesKilos = scan.nextDouble();
        System.out.println("Digite a quantidade(Kg) que deseja de Morangos");
        double strawberriesKilos = scan.nextDouble();

        double applePrice = 0;
        if (applesKilos > 5) {
            applePrice = applesKilos * 1.5;
        } else {
            applePrice = applesKilos * 1.8;
        }

        double strawberriesPrice = 0;
        if (strawberriesKilos > 5) {
            strawberriesPrice = strawberriesKilos * 2.2;
        } else {
            strawberriesPrice = strawberriesKilos * 2.5;
        }

        double totalPayable = applePrice + strawberriesPrice;
        double totalKilos = applesKilos + strawberriesKilos;
        if (totalKilos > 8 || totalPayable > 25) {
            totalPayable *= 0.9;
        }

        System.out.println("Total a pagar: R$" + totalPayable);
        scan.close();
    }
}
