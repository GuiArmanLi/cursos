import java.util.Scanner;

public class Ex34_Bonus {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a quantidade de termos que deseja calcular");
        var terms = scan.nextInt();

        var h = 1;
        System.out.print("H = 1 + ");
        for (int i = 0, n = 1, m = 1; i < terms; i++, m++) {
            System.out.print(n + "/" + m + " + ");
            h += (n / m);
        }
        System.out.println("\n\nH = " + h);
        scan.close();
    }
}
