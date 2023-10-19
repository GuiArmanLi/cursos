import java.util.Scanner;

public class Ex24 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite dois numeros");
        var number1 = scan.nextDouble();
        var number2 = scan.nextDouble();
        double result = 0;

        System.out.println("Digite a operacao que deseja realizar");
        System.out.println("\"+\" - Soma | \"-\" - Subtracao | \"*\" - Multiplicacao | \"/\" - Divisao");
        var operation = scan.next();

        switch (operation) {
            case "+":
                result = number1 + number2;
                break;
            case "-":
                result = number1 - number2;
                break;
            case "*":
                result = number1 * number2;
                break;
            case "/":
                result = number1 / number2;
                break;
            default:
                System.out.println("Operacao incorreta");
        }

        System.out.println("Resultado: " + result);
        if ((int) result % 2 == 0) {
            System.out.println("Resultado: Par");
        } else {
            System.out.println("Resultado: Impar");
        }

        if (result >= 0) {
            System.out.println("Positivo");
        } else {
            System.out.println("Negativo");
        }

        if (result == (int) result) {
            System.out.println("Inteiro");
        } else {
            System.out.println("Decimal");
        }
        scan.close();
    }
}
