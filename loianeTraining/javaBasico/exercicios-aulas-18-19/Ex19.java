import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] students = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        double[] note1 = new double[10];
        double[] note2 = new double[10];

        var average = 0.0;
        for (int i = 0; i < students.length; i++) {
            System.out.print("Primeira nota do " + (i + 1) + " aluno\t");
            note1[i] = scan.nextDouble();

            System.out.print("Segunda nota do " + (i + 1) + " aluno\t");
            note2[i] = scan.nextDouble();

            average = (note1[i] + note2[i]) / 2;
            System.out.print("Media = " + average);
            if (average < 7) {
                System.out.print(" - Reprovado\n\n");
            } else {
                System.out.print(" - Aprovado\n\n");
            }
        }
        scan.close();
    }
}
