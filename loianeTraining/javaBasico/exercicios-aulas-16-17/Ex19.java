import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite quantos numeros deseja entrar");
        var quantidadeDeLeituras = scan.nextInt();

        var numero = 0;
        var soma = 0;
        var maiorNumero = 0;
        for (int i = 0; i < quantidadeDeLeituras; i++) {
            System.out.println("Digite um numero");
            numero = scan.nextInt();

            if (numero < 0 || numero > 1000) {
                System.out.println("Digite apenas numero entre 0 - 1000");
                scan.close();
                return;
            }

            soma += numero;
            if (numero > maiorNumero) {
                maiorNumero = numero;
            }
        }

        System.out.println("Voce digitou " + numero + " numeros");
        System.out.println("Soma: " + soma);
        System.out.println("Maior numero digitado: " + maiorNumero);
        scan.close();
    }
}
