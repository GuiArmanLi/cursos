import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class FilaDoRecreio {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int casos = scanner.nextInt();

        for (int c = 0; c < casos; c++) {
            int m = scanner.nextInt();

            Integer[] chegada = new Integer[m];
            for (int i = 0; i < m; i++) {
                chegada[i] = scanner.nextInt();
            }

            Integer[] ordenada = Arrays.copyOf(chegada, m);
            Arrays.sort(ordenada, Collections.reverseOrder());

            int mesmoLugar = 0;
            for (int i = 0; i < m; i++) {
                if (chegada[i].equals(ordenada[i])) {
                    mesmoLugar++;
                }
            }

            System.out.println(mesmoLugar);
        }
    }
}
