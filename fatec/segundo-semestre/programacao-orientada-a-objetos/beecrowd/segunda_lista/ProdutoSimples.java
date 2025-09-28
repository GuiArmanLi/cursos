
import java.util.Scanner;

public class ProdutoSimples {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        var primeiroValor = scanner.nextInt();    
        var segundoValor = scanner.nextInt();    

        var produto = primeiroValor * segundoValor;

        System.out.printf("PROD = %s\n", produto);
    }    
}
