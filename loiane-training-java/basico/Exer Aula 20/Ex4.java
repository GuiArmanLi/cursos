import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        var day = 30;
        var hour = 24;
        String[][] calendar = new String[day][hour];
        var appointment = "";
        var read = "";
        var add = true;
        while (add) {
            System.out.println("Gostaria de marcar algum compromisso?\t \"Y\" - Yes | \"N\" - No | \"V\" - Ver agenda");
            read = scan.nextLine();

            var tempDay = 0;
            var tempHour = 0;
            if (read.equalsIgnoreCase("Y")) {
                System.out.println("Qual dia gostaria de marcar?");
                tempDay = scan.nextInt();

                System.out.println("Qual horario gostaria de marcar?");
                tempHour = scan.nextInt();

                System.out.println("Qual o nome do compromisso?");
                scan.nextLine();
                appointment = scan.nextLine();

                calendar[tempDay][tempHour] = appointment;
            } else {
                System.out.println("Voce tem os seguintes compromissos:");

                for (int mDay = 0; mDay < day; mDay++) {
                    for (int mHour = 0; mHour < hour; mHour++) {
                        if (calendar[mDay][mHour] != null) {
                            System.out.print(
                                    "Dia " + (mDay + 1) + " as " + (mHour + 1) + " Horas: " + calendar[mDay][mHour] + "\n");
                        }
                    }
                }
            }

            if (read.equalsIgnoreCase("N")) {
                add = false;
            }
        }
        scan.close();
    }
}
