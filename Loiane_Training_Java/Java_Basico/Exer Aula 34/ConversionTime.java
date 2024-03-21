import java.util.Scanner;

public class ConversionTime {

    public static int minutesToSeconds(int minutes) {
        return minutes * 60;
    }

    public static int hoursToMinutes(int hours) {
        return hours * 60;
    }

    public static int daysToHours(int days) {
        return days * 24;
    }

    public static int weeksToDays(int weeks) {
        return weeks * 7;
    }

    public static int monthsToDays(int months) {
        return months * 30;
    }

    public static int yearsToDays(int years) {
        return years * 365;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual operacao deseja realizar?");
        System.out.println("1\tMinuto para segundos");
        System.out.println("2\tHora para minutos");
        System.out.println("3\tDia para horas");
        System.out.println("4\tSemanas para dias");
        System.out.println("5\tMeses para dias");
        System.out.println("6\tAnos para dias");

        var operation = scan.nextInt();

        System.out.println("Numero a converter");
        var number = scan.nextInt();

        int result;
        switch (operation) {
            case 1:
                result = ConversionTime.minutesToSeconds(number);
                System.out.println(result);
                break;
            case 2:
                result = ConversionTime.hoursToMinutes(number);
                System.out.println(result);
                break;
            case 3:
                result = ConversionTime.daysToHours(number);
                System.out.println(result);
                break;
            case 4:
                result = ConversionTime.weeksToDays(number);
                System.out.println(result);
                break;
            case 5:
                result = ConversionTime.monthsToDays(number);
                System.out.println(result);
                break;
            case 6:
                result = ConversionTime.yearsToDays(number);
                System.out.println(result);
                break;
            default:
                System.out.println("Operacao invalida");
                break;
        }
        scan.close();
    }
}
