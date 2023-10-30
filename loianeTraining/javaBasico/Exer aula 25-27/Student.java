import java.util.Scanner;
import java.util.UUID;

public class Student {
    UUID id = UUID.randomUUID();
    String name;
    String course;
    String[] disciplines = new String[3];
    double[][] notes = new double[3][2];
    String[] approval = new String[3];

    public double[] verifyApproval(double[][] notes) {
        double[] averageNotes = calculateAverage(notes);

        for (int i = 0; i < averageNotes.length; i++) {
            if (averageNotes[i] >= 7) {
                approval[i] = "Aprovado";
            } else {
                approval[i] = "Reprovado";
            }
        }
        return averageNotes;
    }

    private double[] calculateAverage(double[][] notes) {
        double[] averageNotes = new double[3];
        for (int i = 0; i < notes.length; i++) {
            averageNotes[i] = (notes[i][0] + notes[i][1]) / 2;
        }
        return averageNotes;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Student student = new Student();

        System.out.println("Digite seu nome");
        student.name = scan.nextLine();

        System.out.println("Digite o nome do seu curso");
        student.course = scan.nextLine();

        for (int i = 0; i < student.disciplines.length; i++) {
            System.out.println("Qual nome da " + (i + 1) + " disciplina do seu curso?");
            student.disciplines[i] = scan.nextLine();
        }

        for (int i = 0; i < student.disciplines.length; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println("Nota " + (i + 1) + " da " + student.disciplines[i]);
                student.notes[i][j] = scan.nextDouble();
            }
        }

        var averageNotes = student.verifyApproval(student.notes);

        System.out.println("Aluno: " + student.name);
        System.out.println("Matricula: " + student.id);
        System.out.println("Curso: " + student.course);
        for (int i = 0; i < student.disciplines.length; i++) {
            System.out.println("Disciplina - " + student.disciplines[i] +
                    "\nNota " + averageNotes[i] +
                    "\nResultado  - " + student.approval[i] + "\n");
        }
        scan.close();
    }
}
