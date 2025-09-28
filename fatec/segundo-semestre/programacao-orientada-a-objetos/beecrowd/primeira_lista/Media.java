
import java.io.IOException;
import java.util.Scanner;

public class Media {

    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        var a = scan.nextDouble();
        var b = scan.nextDouble();

        var media = (a * 3.5 + b * 7.5) / 11;

        System.out.printf("MEDIA = %.5f%n", media);
    }

}
