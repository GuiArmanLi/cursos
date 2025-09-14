import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class BalancoDeParenteses {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String expression = scanner.nextLine();

            if (validExpression(expression)) {
                System.out.println("correct");
            } else {
                System.out.println("incorrect");
            }
        }
    }

    private static boolean validExpression(String expression) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);

            if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            }
        }

        return stack.isEmpty();
    }
}
