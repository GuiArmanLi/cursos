import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        var nota1 = scan.nextDouble();
        var nota2 = scan.nextDouble();
        var nota3 = scan.nextDouble();

        var media = (nota1 + nota2 + nota3) / 3;

        if (media == 10) {
            System.out.println("Aprovado com distincao");
        } else if (media >= 7) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
        scan.close();
    }
}
