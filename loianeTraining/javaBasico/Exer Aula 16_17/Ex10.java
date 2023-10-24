import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite dois numeros");
        var number1 = scan.nextInt();
        var number2 = scan.nextInt();

        var higher = 0;
        var smallest = 0;
        if (number1 > number2) {
            higher = number1;
            smallest = number2;
        } else {
            higher = number2;
            smallest = number1;
        }

        System.out.println("Os numero inteiros entre " + number1 + " e " + number2 + " sao:");
        for (int currentNumber = smallest; currentNumber <= higher; currentNumber++) {
            System.out.print(currentNumber + " ");
        }
        scan.close();
    }
}
