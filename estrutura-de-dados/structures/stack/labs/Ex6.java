package structures.stack.labs;

import structures.stack.Stack;

import java.util.Scanner;

public class Ex6 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Digite a expressao matematica: ");
        String expression = scanner.nextLine();

        System.out.println("Expressao e valida? " + validExpression(expression));
    }

    private static boolean validExpression(String expression) {
        var stack = new Stack<>();
        for (int i = 0; i < expression.length(); i++) {
            var character = expression.charAt(i);
            if (character == '(')
                stack.push(character);

            if (character == ')') {
                var lastCharacter = stack.peek();
                if (lastCharacter != null && lastCharacter.equals('(')) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
