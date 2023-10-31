import java.util.Scanner;

class Calculator {
    public static double sum(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }

    public static double subtraction(double firstNumber, double secondNumber) {
        return firstNumber - secondNumber;
    }

    public static double multiplication(double firstNumber, double secondNumber) {
        return firstNumber * secondNumber;
    }

    public static double divide(double firstNumber, double secondNumber) {
        return firstNumber / secondNumber;
    }

    public static double pow(double firstNumber, double secondNumber) {
        return Math.pow(firstNumber, secondNumber);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um numero");
        double firstNumber = scan.nextDouble();

        System.out.println("Digite outro numero");
        double secondNumber = scan.nextDouble();

        var sum = Calculator.sum(firstNumber, secondNumber);
        var subtraction = Calculator.subtraction(firstNumber, secondNumber);
        var multiplication = Calculator.multiplication(firstNumber, secondNumber);
        var divide = Calculator.divide(firstNumber, secondNumber);
        var pow = Calculator.pow(firstNumber, secondNumber);

        System.out.println("Soma: " + sum);
        System.out.println("Subtracao: " + subtraction);
        System.out.println("Multiplicacao: " + multiplication);
        System.out.println("Divisao: " + divide);
        System.out.println("Potencia: " + pow);
        scan.close();
    }
}