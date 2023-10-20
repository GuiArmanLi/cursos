import java.util.Scanner;

public class Ex33_Bonus {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a quantidade de termos que deseja calcular");
        var terms = scan.nextInt();

        var total = 0.0;
        System.out.print("S = ");
        for (int i = 0, n = 1, m = 1; i < terms; i++, n++, m += 2) {
            System.out.print(n + "/" + m + " + ");

            total += (n / m);
        }
        System.out.println("\nTotal: " + total);
        scan.close();
    }
}
