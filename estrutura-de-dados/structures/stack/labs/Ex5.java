package structures.stack.labs;

import structures.stack.Stack;

public class Ex5 {
    public static void main(String[] args) {
        var stack = new Stack<String>();

        stack.push("A");
        stack.push("A");
        stack.push("B");
        stack.push("C");
        //stack.push("D");
        stack.push("C");
        stack.push("B");
        stack.push("A");
        stack.push("A");

        System.out.println("Stack e um palindrome? " + isPalindrome(stack));
        stack.pop();
        System.out.println("Stack e um palindrome? " + isPalindrome(stack));

    }

    private static boolean isPalindrome(Stack stack) {
        var auxStack1 = new Stack<>();
        var auxStack2 = new Stack<>();

        int i1 = stack.size() / 2;
        for (int i = 0; i < i1; i++) {
            auxStack1.push(stack.pop());
            auxStack2.push(auxStack1.pop());
        }

        for (int i = 0; i < stack.size() / 2; i++) {
            if (stack.size() % 2 == 1)
                stack.pop();

            if (!stack.peek().equals(auxStack2.peek()))
                return false;
        }

        return true;
    }
}
