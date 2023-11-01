import java.util.Scanner;

public class Sum {
    static int sum;

    public static void recursion(int number) {
        if (number > 0) {
            sum += number;
            recursion(--number);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um numero inteiro");
        int number = scan.nextInt();

        Sum.recursion(number);
        System.out.println(sum);

        scan.close();
    }
}
