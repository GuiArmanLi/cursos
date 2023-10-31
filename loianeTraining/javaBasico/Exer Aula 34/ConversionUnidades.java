import java.util.Scanner;

public class ConversionUnidades {

    public static double metersToWeights(double meters) {
        return meters * 10.76;
    }

    public static double weightsToCentimeters(double weights) {
        return weights * 929;
    }

    public static double milesToAcres(double miles) {
        return miles * 640;
    }

    public static double acreToWeights(double acre) {
        return acre * 43.560;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual operacao deseja realizar?");
        System.out.println("1\tMetros para Pes quadrado");
        System.out.println("2\tPes quadrado para Cm quadrados");
        System.out.println("3\tMilhas quadradas para Acres");
        System.out.println("4\tAcres para Pes quadrado");

        var operation = scan.nextInt();

        System.out.println("Numero a converter");
        var number = scan.nextInt();

        double result;
        switch (operation) {
            case 1:
                result = ConversionUnidades.metersToWeights(number);
                System.out.println(result);
                break;
            case 2:
                result = ConversionUnidades.weightsToCentimeters(number);
                System.out.println(result);
                break;
            case 3:
                result = ConversionUnidades.milesToAcres(number);
                System.out.println(result);
                break;
            case 4:
                result = ConversionUnidades.acreToWeights(number);
                System.out.println(result);
                break;
            default:
                System.out.println("Operacao invalida");
                break;
        }
        scan.close();
    }
}
