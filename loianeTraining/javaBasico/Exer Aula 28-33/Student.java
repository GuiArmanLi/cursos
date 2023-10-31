import java.util.Scanner;
import java.util.UUID;

public class Student {
    private UUID id = UUID.randomUUID();
    private String name;
    private String course;
    private String[] disciplines = new String[3];
    private double[][] notes = new double[3][2];
    private String[] approval = new String[3];

    Student() {
    }

    Student(String name, String course) {
        this.name = name;
        this.course = course;
    }

    public UUID getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return this.course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String[] getDisciplines() {
        return this.disciplines;
    }

    public void setDisciplines(int index, String discipline) {
        this.disciplines[index] = discipline;
    }

    public double[][] getNotes() {
        return this.notes;
    }

    public void setNotes(int line, int column, double note) {
        this.notes[line][column] = note;
    }

    public String[] getApproval() {
        return this.approval;
    }

    public void setApproval(int index, String approval) {
        this.approval[index] = approval;
    }

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
        student.setName(scan.nextLine());

        System.out.println("Digite o nome do seu curso");
        student.setCourse(scan.nextLine());

        for (int i = 0; i < student.getDisciplines().length; i++) {
            System.out.println("Qual nome da " + (i + 1) + " disciplina do seu curso?");
            student.setDisciplines(i, scan.nextLine());
        }

        for (int line = 0; line < student.disciplines.length; line++) {
            for (int column = 0; column < 2; column++) {
                System.out.println("Nota " + (line + 1) + " da " + student.getDisciplines()[line]);
                student.setNotes(line, column, scan.nextDouble());
            }
        }

        var averageNotes = student.verifyApproval(student.notes);

        System.out.println("Aluno: " + student.getName());
        System.out.println("Matricula: " + student.getId());
        System.out.println("Curso: " + student.getCourse());
        for (int i = 0; i < student.getDisciplines().length; i++) {
            System.out.println("Disciplina - " + student.getDisciplines()[i] +
                    "\nNota " + averageNotes[i] +
                    "\nResultado  - " + student.getApproval()[i] + "\n");
        }
        scan.close();
    }
}
