import java.util.Scanner;

public class Sum {
    static int sum;
    public static void recursion(int number) {
        sum += number;
        System.out.println(number);
        recursion(--number);
        if (number == 0) {
            return;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um numero inteiro");
        int number = scan.nextInt();

        Sum.recursion(number);
        scan.close();
    }
}
