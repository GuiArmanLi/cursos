import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        var number = 0;
        var quantityOfPair = 0;
        var quantityOfOdd = 0;
        for (int i = 0; i < 10; i++) {
            number = scan.nextInt();
            if (number % 2 == 0) {
                quantityOfPair++;
            } else {
                quantityOfOdd++;
            }
        }
        System.out.println("Pares: " + quantityOfPair + " | Impares: " + quantityOfOdd);
        scan.close();
    }
}
