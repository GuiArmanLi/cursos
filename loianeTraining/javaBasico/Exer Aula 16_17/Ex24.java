import java.util.Scanner;

public class Ex24 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite quantas notas deseja inserir");
        var notes = scan.nextInt();

        var note = 0;
        var sum = 0;
        for (int i = 0; i < notes; i++) {
            System.out.println("Digite a nota");
            note = scan.nextInt();

            sum += note;
        }

        System.out.println("Media aritmetica: " + (sum / notes));
        scan.close();
    }
}
