import java.util.Random;
import java.util.Scanner;

public class Ex33 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        var reading = scan.nextInt();

        var total = 0;
        var temperature = 0;
        Random random = new Random();
        for (int i = 0; i < reading; i++) {
            temperature = random.nextInt(0, 40);
            total += temperature;
        }

        var average = total / reading;
        System.out.println("Media da temperatura: " + average);
        scan.close();
    }
}
