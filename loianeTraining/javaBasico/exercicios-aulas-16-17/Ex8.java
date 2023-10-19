import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double number = 0;
        double sum = 0;
        double average = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um numero");
            number = scan.nextInt();
            
            sum += number;
        }
        average = sum / 4;
        System.out.println("Soma:" + sum);
        System.out.println("Media:" + average);

        scan.close();
    }
}
