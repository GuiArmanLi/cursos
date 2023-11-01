import java.util.Scanner;

class Fibonacci {
    static int previousNumber;

    public static void displaySequenceFibonacci(int size, int currentValue) {
        if (size > 0) {
            System.out.print(currentValue + ", ");

            previousNumber = currentValue - previousNumber;
            currentValue += previousNumber;

            displaySequenceFibonacci(--size, currentValue);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o tamanho da sequencia de Fibonacci");
        var size = scan.nextInt();

        Fibonacci.displaySequenceFibonacci(size, 1);
        scan.close();
    }
}