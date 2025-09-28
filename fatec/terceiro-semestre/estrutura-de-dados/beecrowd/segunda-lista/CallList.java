import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CallList {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Digite o valor de n: ");
        int n;
        while (true) {
            n = scanner.nextInt();

            if (n > 0 && n <= 100)
                break;
        }

        System.out.print("Digite o valor de k: ");
        var k = scanner.nextInt();
        while (true) {
            k = scanner.nextInt();

            if (k > 0 && k <= n)
                break;
        }

        List<String> names = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            var name = scanner.nextLine().toLowerCase();
            if (!(name.length() > 1 && name.length() < 20))
                i--;
            else
                names.add(name);
        }
    }
}
