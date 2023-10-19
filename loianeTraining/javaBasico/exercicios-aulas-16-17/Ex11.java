import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite dois numeros");
        var number1 = scan.nextInt();
        var number2 = scan.nextInt();

        var maior = 0;
        var menor = 0;
        if (number1 > number2) {
            maior = number1;
            menor = number2;
        } else {
            maior = number2;
            menor = number1;
        }

        var soma = 0;
        for (int numberAtual = menor; numberAtual <= maior; numberAtual++) {
            soma += numberAtual;
        }
        System.out.println("A soma do intervalo entre os dois numero digitados e: " + soma);
        scan.close();
    }
}
