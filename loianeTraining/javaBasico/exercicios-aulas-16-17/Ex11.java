import java.util.Scanner;

public class Ex11 {
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

        var soma = 0;
        for (int currentNumber = smallest; currentNumber <= higher; currentNumber++) {
            soma += currentNumber;
        }
        System.out.println("A soma do intervalo entre os dois numero digitados e: " + soma);
        scan.close();
    }
}
