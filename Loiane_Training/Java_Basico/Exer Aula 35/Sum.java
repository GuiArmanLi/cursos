import java.util.Scanner;

public class Sum {
    public static int recursion(int number) {
        if (number == 1){
            return 1;
        }

        return number + recursion(number - 1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um numero inteiro");
        int number = scan.nextInt();

        var result = Sum.recursion(number);
        System.out.println(result);
        scan.close();
    }
}
