import java.util.Scanner;

public class Ex28 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Colecionar de DVDs, digite quantos DVDs possui");
        var totalDvds = scan.nextInt();

        var dvdValue = 0;
        var totalInvested = 0;
        for (int i = 0; i < totalDvds; i++) {
            System.out.println("Digite o valor do " + (i + 1) + " DVD");
            dvdValue = scan.nextInt();

            totalInvested += dvdValue;
        }
        var media = totalInvested / totalDvds;

        System.out.println("O valor investido na colecao foi R$" + totalInvested);
        System.out.println("A media de cada DVD foi R$" + media);
        scan.close();
    }
}
