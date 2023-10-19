import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Tabuada de qual numero deseja ver?");
        var numeroDaTabuada = scan.nextInt();
        for (int i = 0; i <= 10; i++) {
            System.out.println(numeroDaTabuada + " x " + i + " = " + numeroDaTabuada * i);
        }
        scan.close();
    }
}
