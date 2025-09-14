import java.io.*;
import java.util.*;

public class EuPossoAdivinharEstruturaDeDados {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        while (scanner.hasNext()) {
            int n = scanner.nextInt();

            Stack<Integer> stack = new Stack<>();
            Queue<Integer> queue = new LinkedList<>();
            PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

            boolean isStack = true;
            boolean isQueue = true;
            boolean isPQ = true;

            for (int i = 0; i < n; i++) {
                int op = scanner.nextInt();
                int value = scanner.nextInt();

                if (op == 1) {
                    stack.push(value);
                    queue.offer(value);
                    pq.offer(value);
                } else {
                    if (stack.isEmpty() || queue.isEmpty() || pq.isEmpty()) {
                        isStack = false;
                        isQueue = false;
                        isPQ = false;
                    } else {
                        if (isStack && !stack.pop().equals(value))
                            isStack = false;
                        if (isQueue && !queue.poll().equals(value))
                            isQueue = false;
                        if (isPQ && !pq.poll().equals(value))
                            isPQ = false;
                    }
                }
            }

            if (isStack && !isQueue && !isPQ) {
                System.out.println("stack");
            } else if (!isStack && isQueue && !isPQ) {
                System.out.println("queue");
            } else if (!isStack && !isQueue && isPQ) {
                System.out.println("priority queue");
            } else if (!isStack && !isQueue && !isPQ) {
                System.out.println("impossible");
            } else {
                System.out.println("not sure");
            }
        }
    }
}