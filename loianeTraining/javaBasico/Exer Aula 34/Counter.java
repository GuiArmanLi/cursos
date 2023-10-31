import java.util.Scanner;

public class Counter {
    private static int plus = 0;

    public static int getPlus() {
        return plus;
    }

    public static void plus() {
        plus++;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um numero");
        var number = scan.nextInt();

        System.out.println("O metodo cont foi chamado " + number + " vezes");
        for (int i = 0; i < number; i++) {
            Counter.plus();
        }
        
        System.out.println("Plus = " + Counter.getPlus());

        scan.close();
    }
}
