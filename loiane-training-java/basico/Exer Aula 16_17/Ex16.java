import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Ate qual variavel deseja extender o numero de fibonacci?");
        var fibonacciSize = scan.nextInt();

        var currentNumber = 1;
        var numberBefore = 0;
        for (int i = 0; i < fibonacciSize; i++) {
            System.out.print(currentNumber + " ");
            
            currentNumber = (currentNumber + numberBefore);
            numberBefore = (currentNumber - numberBefore);
            if (currentNumber > 500) {
                System.out.println("\nProximo valor maior que 500");
                break;
            }
        }
        scan.close();
    }
}
