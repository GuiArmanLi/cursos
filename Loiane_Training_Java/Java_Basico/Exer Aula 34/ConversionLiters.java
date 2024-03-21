import java.util.Scanner;

public class ConversionLiters {

    public static double litersToCentimeterCubic(double liters) {
        return liters * 1000;
    }

    public static double meterCubicToLiters(double meterCubic) {
        return meterCubic * 1000;
    }

    public static double metersCubicToWeightsCubic(double metersCubic) {
        return metersCubic * 35.32;
    }

    public static double americanGalonToWeightsCubic(double americanGalon) {
        return americanGalon * 231;
    }

    public static double americanGalonToLiters(double americanGalon) {
        return americanGalon * 3.785;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual operacao deseja realizar?");
        System.out.println("1\tLitros para Centimetros cubicos");
        System.out.println("2\tMetros cubicos para Litros");
        System.out.println("3\tMetros cubicos para Pes cubicos");
        System.out.println("4\tGalao Americano para Pes cubicos");
        System.out.println("5\tGalao Americano para Litros");

        var operation = scan.nextInt();

        System.out.println("Numero a converter");
        var number = scan.nextInt();

        double result;
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
            default:
                System.out.println("Operacao invalida");
                break;
        }
        scan.close();
    }
}
