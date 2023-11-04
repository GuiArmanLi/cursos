import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual nome do Curso?");
        var courseName = scan.nextLine();
        System.out.println("Qual o horario do curso?");
        var courseHour = scan.nextLine();

        System.out.println("Qual o nome do professor do curso?");
        var professorName = scan.nextLine();
        System.out.println("De qual departamento ele e?");
        var professorDepartment = scan.nextLine();
        System.out.println("Qual o Email do professor?");
        var professorEmail = scan.nextLine();

        Professor professor = new Professor(professorName, professorDepartment, professorEmail);

        Student[] students = new Student[5];
        for (int i = 0; i < students.length; i++) {
            System.out.println("\nDigite o nome do " + (i + 1) + " aluno ");
            var name = scan.next();

            System.out.println("Digite o Registro do aluno");
            var register = scan.nextInt();

            int notes[] = new int[4];
            for (int pos = 0; pos < notes.length; pos++) {
                System.out.print((pos + 1) + " nota do aluno");
                notes[pos] = scan.nextInt();
            }

            Student student = new Student(name, register, notes);
            students[i] = student;
        }

        Course course = new Course(courseName, courseHour, professor, students);

        int averageTeam = 0;
        for (Student student : course.getStudents()) {
            System.out.print(student.getName() + " - ");

            double averageNotes = averageNotes(student.getNotes());
            System.out.print("Media: " + averageNotes + " | ");

            System.out.println(isApproval(averageNotes));
            averageTeam += averageNotes;
        }

        System.out.println("Media da Turma: " + averageTeam / students.length);
        scan.close();
    }

    private static double averageNotes(int[] notes) {
        int sum = 0;
        for (int note : notes) {
            sum += note;
        }

        return sum / notes.length;
    }

    private static String isApproval(double averageNotes) {
        if (averageNotes >= 7) {
            return "Aprovado";
        }
        return "Reprovado";
    }
}
