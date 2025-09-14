import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class JogandoCartasFora {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        StringBuilder response = new StringBuilder();
        while (true) {
            var n = scanner.nextInt();
            if (n == 0)
                break;

            Queue<Integer> fila = new LinkedList<>();
            for (int i = 1; i <= n; i++) {
                fila.add(i);
            }

            response.append("Discarded cards:");
            boolean primeiro = true;

            while (fila.size() > 1) {
                if (primeiro) {
                    response.append(" " + fila.poll());
                    primeiro = false;
                } else {
                    response.append(", " + fila.poll());
                }

                fila.add(fila.poll());
            }

            response.append("\nRemaining card: " + fila.peek() + "\n");
        }

        response.setLength(response.length() -1);
        System.out.println(response);
    }
}
