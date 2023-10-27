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

        for (int i = 0; i < student.disciplines.length; i++) {
            System.out.println("Qual nome da " + (i + 1) + " disciplina do seu curso?");
            student.disciplines[i] = scan.nextLine();
        }

        for (int i = 0; i < student.disciplines.length; i++) {
            System.out.println("Digite a sua primeira nota da " + student.disciplines[i]);
            student.notes[i][0] = scan.nextDouble();
            System.out.println("Digite a sua segunda nota da " + student.disciplines[i]);
            student.notes[i][1] = scan.nextDouble();
        }

        var averageNotes = student.verifyApproval(student.notes);
        for (int i = 0; i < student.disciplines.length; i++) {
            System.out.println("Disciplina - " + student.disciplines[i] +
                    " - Nota " + averageNotes[i] +
                    " - Resultado  - " + student.approval[i]);
        }
        scan.close();
    }
}
