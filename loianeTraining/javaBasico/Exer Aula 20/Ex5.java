import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        var month = 12;
        var day = 30;
        var hour = 8;
        String[][][] calendar = new String[month][day][hour];

        String appointment;
        String read;
        var add = true;
        while (add) {
            System.out.println("\nGostaria de marcar algum compromisso?\t \"Y\" - Yes | \"N\" - No | \"V\" - Ver agenda");
            read = scan.nextLine();

            var scheduleMonth = 0;
            var scheduleDay = 0;
            var scheduleHour = 0;
            if (read.equalsIgnoreCase("Y")) {
                System.out.println("Qual mes gostaria de marcar?");
                scheduleMonth = scan.nextInt();

                System.out.println("Qual dia gostaria de marcar?");
                scheduleDay = scan.nextInt();

                System.out.println("Qual horario gostaria de marcar?");
                scheduleHour = scan.nextInt();

                System.out.println("Qual o nome do compromisso?");
                scan.nextLine();
                appointment = scan.nextLine();

                calendar[scheduleMonth][scheduleDay][scheduleHour] = appointment;
            } else if (read.equalsIgnoreCase("V")) {
                System.out.println("Voce tem os seguintes compromissos:");

                for (int mMonth = 0; mMonth < calendar.length; mMonth++) {
                    for (int mDay = 0; mDay < day; mDay++) {
                        for (int mHour = 0; mHour < hour; mHour++) {
                            if (calendar[mMonth][mDay][mHour] != null) {
                                System.out.print("Mes " + (mMonth + 1));
                                System.out.print(", no dia " + (mDay + 1));
                                System.out.print(", " + (mHour + 1) + " Horas: " + calendar[mMonth][mDay][mHour] + "\n");
                            }
                        }
                    }
                }
            } else if (read.equalsIgnoreCase("N")) {
                add = false;
            } else {
                System.out.println("Digite uma opcao valida");
            }
        }
        scan.close();
    }
}
