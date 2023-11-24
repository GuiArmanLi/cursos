import java.util.Scanner;

public class Ex36 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Montar tabuada de: ");
        var table = scan.nextInt();

        System.out.print("Comecar por: ");
        var start = scan.nextInt();

        System.out.print("Terminar em: ");
        var end = scan.nextInt();

        if (start > end) {
            System.out.println("Inicio deve ser antes do fim");
            scan.close();
            return;
        }

        System.out.println(
                "Vou montar a tabuada de " + table + " comecando em " + start + " e terminado em " + end + ":");
        for (int i = start; i <= end; i++) {
            System.out.println(table + " x " + i + " = " + (table * i));
        }
        scan.close();
    }
}
