import java.util.Scanner;

public class Ex21 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor do saque. Obs.: Valor minimo = 10, valor maximo = 600");
        var plunder = scan.nextInt();
        var bankNote = 0;

        if (plunder >= 100) {
            bankNote = plunder / 100;
            plunder = plunder - bankNote * 100;
            if (bankNote > 1) {
                System.out.println(bankNote + " notas de R$100");
            } else {
                System.out.println(bankNote + " nota de R$100");
            }
        }
        if (plunder >= 50) {
            bankNote = plunder / 50;
            plunder -= bankNote * 50;
            if (bankNote > 1) {
                System.out.println(bankNote + " notas de R$50");
            } else {
                System.out.println(bankNote + " nota de R$50");
            }
        }
        if (plunder >= 10) {
            bankNote = plunder / 10;
            plunder -= bankNote * 10;
            if (bankNote > 1) {
                System.out.println(bankNote + " notas de R$10");
            } else {
                System.out.println(bankNote + " nota de R$10");
            }
        }
        if (plunder >= 5) {
            bankNote = plunder / 5;
            plunder -= bankNote * 5;
            if (bankNote > 1) {
                System.out.println(bankNote + " notas de R$5");
            } else {
                System.out.println(bankNote + " nota de R$5");
            }
        }
        if (plunder >= 1) {
            bankNote = plunder / 1;
            plunder -= bankNote * 1;
            if (bankNote > 1) {
                System.out.println(bankNote + " notas de R$1");
            } else {
                System.out.println(bankNote + " nota de R$1");
            }
        }
        scan.close();
    }
}
