package structures.stack.labs;

import structures.stack.Stack;

import java.util.Scanner;

public class Ex1 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        var stack = new Stack<Integer>();

        final int AMOUNT = 10;
        for (int i = 0; i < AMOUNT; i++) {
            System.out.println("Digite um numero: ");
            var element = scanner.nextInt();

            if (element % 2 == 0)
                stack.push(element);
            else
                stack.pop();

            if (stack.isEmpty())
                System.out.println("Pilha está vazia");
        }

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

    }
}
