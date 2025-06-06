import java.io.*;
import java.util.Stack;

public class MenorDaPilha {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();
        Stack<Integer> minStack = new Stack<>();
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < n; i++) {
            String line = br.readLine();

            if (line.startsWith("PUSH")) {
                int value = Integer.parseInt(line.substring(5));
                stack.push(value);
                if (minStack.isEmpty() || value <= minStack.peek()) {
                    minStack.push(value);
                } else {
                    minStack.push(minStack.peek());
                }
            } else if (line.equals("POP")) {
                if (stack.isEmpty()) {
                    output.append("EMPTY\n");
                } else {
                    stack.pop();
                    minStack.pop();
                }
            } else if (line.equals("MIN")) {
                if (minStack.isEmpty()) {
                    output.append("EMPTY\n");
                } else {
                    output.append(minStack.peek()).append("\n");
                }
            }
        }

        System.out.print(output);
    }
}
