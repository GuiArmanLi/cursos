
import java.io.IOException;
import java.util.Scanner;

public class IdadeEmDias {

    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        var idade = scan.nextInt();

        int anos = idade / 365;
        int meses = (idade % 365) / 30;
        int dias = (idade % 365) % 30;

        System.out.println(anos + " ano(s)");
        System.out.println(meses + " mes(es)");
        System.out.println(dias + " dia(s)");
    }
}
