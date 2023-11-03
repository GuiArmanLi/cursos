import java.util.Scanner;

class Fibonacci {
    public static int displayFibonacci(int size) {
        if (size < 2) {
            return 1;
        }
        return displayFibonacci(size - 1) + displayFibonacci(size - 2);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o n numero da sequencia de Fibonacci");
        var size = scan.nextInt();

        var result = Fibonacci.displayFibonacci(size);

        System.out.println(result);
        scan.close();
    }
}