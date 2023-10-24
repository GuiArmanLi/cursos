import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual o tamanho do numero de Fibonacci deseja ver?");
        var fibonacciSize = scan.nextInt();

        var currentNumber = 1;
        var numberBefore = 0;
        for (int i = 0; i < fibonacciSize; i++) {
            System.out.print(currentNumber + " ");
            currentNumber = (currentNumber + numberBefore);
            numberBefore = (currentNumber - numberBefore);
        }
        scan.close();
    }
}
