package structures.stack.labs;

import structures.stack.Stack;

import java.util.Scanner;

public class Ex7 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Digite um numero: ");
        var number = scanner.nextInt();

        var stack = new Stack<Integer>();
        while (true) {
            if (number % 2 == 0) {
                stack.push(0);
            } else {
                stack.push(1);
            }

            number /= 2;
            if (number == 1) {
                stack.push(1);
                break;
            }
        }

        System.out.println("Binario do numero digitado e: ");
        while (true) {
            if (stack.isEmpty())
                break;

            System.out.print(stack.pop());
        }
    }
}
