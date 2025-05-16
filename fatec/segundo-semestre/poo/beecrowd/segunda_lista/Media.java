import java.util.Scanner;

public class Media {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        var a = scanner.nextDouble();
        var b = scanner.nextDouble();
        var c = scanner.nextDouble();

        var media = ((a * 2) + (b * 3) + (c * 5)) / 10;

        System.out.printf("MEDIA = %.1f\n", media);
    }
}
