import java.util.Scanner;

public class Ex27 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a quantidade de turmas");
        var team = scan.nextInt();

        var quantityOfStudents = 0;
        var totalStudents = 0;
        for (int i = 0; i < team; i++) {
            System.out.println("Digite quantas alunos tem na turma " + (i + 1));
            quantityOfStudents = scan.nextInt();

            if (quantityOfStudents > 40) {
                System.out.println("Quantidade de alunos deve ser inferior a 40");
                i--;
                quantityOfStudents = 0;
            }
            totalStudents += quantityOfStudents;
        }
        var averageStudentToTeam = totalStudents / team;

        System.out.println("Media de alunos por turma: " + averageStudentToTeam);
        scan.close();
    }
}
