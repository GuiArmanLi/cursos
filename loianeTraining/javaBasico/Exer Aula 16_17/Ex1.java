import java.util.Scanner;

class Ex1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        var note = 0;
        do {
            System.out.println("Digite uma nota (0 - 10)");
            note = scan.nextInt();

            if (note < 0 || note > 10) {
                System.out.println("Valor invalido");
            }
        } while (note < 0 || note > 10);
        scan.close();
    }
}