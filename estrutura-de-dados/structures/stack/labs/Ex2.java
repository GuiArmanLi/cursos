package structures.stack.labs;

import structures.stack.Stack;

import java.util.Scanner;

public class Ex2 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        var even = new Stack<Integer>();
        var odd = new Stack<Integer>();

        final int AMOUNT = 10;
        for (int i = -1; i < AMOUNT; i++) {
            System.out.println("Digite um numero: ");
            var number = scanner.nextInt();

            if (number == 0) {
                if (even.isEmpty() || odd.isEmpty()) {
                    System.out.println("Pilha Par ou Impar vazia");
                } else {
                    even.pop();
                    odd.pop();
                }

            } else if (number % 2 == 0) {
                even.push(number);
            } else {
                odd.push(number);
            }
        }

        System.out.println("Stack Par");
        while (true) {
            var element = even.pop();
            if (element == null)
                break;

            System.out.print(element + " ");
        }

        System.out.println("\nStack Impar");
        while (true) {
            var element = odd.pop();
            if (element == null)
                break;

            System.out.print(element + " ");
        }


    }
}
