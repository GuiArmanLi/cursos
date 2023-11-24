import java.util.Scanner;

public class Ex39 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        var numberOfStudent = 0;
        var numberOfTallerStudent = 0;
        var studentHeight = 0.0;
        var tallerStudent = 0.0;
        for (int i = 0; i <= 10; i++) {
            System.out.println("Digite o numero do aluno");
            numberOfStudent = scan.nextInt();

            System.out.println("Digite o tamanho do aluno");
            studentHeight = scan.nextDouble();

            if (studentHeight > tallerStudent) {
                tallerStudent = studentHeight;
                numberOfTallerStudent = numberOfStudent;
            }
        }

        System.out.println("Numero do aluno mais alto: " + numberOfTallerStudent);
        System.out.println("O aluno possui " + tallerStudent + "m");
        scan.close();
    }
}
