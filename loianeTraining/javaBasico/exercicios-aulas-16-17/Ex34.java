import java.util.Scanner;

public class Ex34 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um numero");
        var number = scan.nextInt();

        boolean odd = false;
        for (int i = 1; i <= number; i++) {
            odd = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    odd = false;
                }
            }
            if (odd) {
                System.out.println(i);
            }
        }
        scan.close();
    }
}
