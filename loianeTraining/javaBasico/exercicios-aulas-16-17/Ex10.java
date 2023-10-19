import java.util.Scanner;

public class Ex10 {
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

        System.out.println("Os numero inteiros entre " + number1 + " e " + number2 + " sao:");
        for (int numberAtual = menor; numberAtual <= maior; numberAtual++) {
            System.out.print(numberAtual + " ");
        }
        scan.close();
    }
}
