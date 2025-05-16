import java.util.Scanner;

public class SomaSimples {
    public static Scanner scanner = new Scanner(System.in); 

    public static void main(String[] args) {
        var a = scanner.nextInt();
        var b = scanner.nextInt();
        
        var soma = a + b;
        
        System.out.printf("SOMA = %s\n", soma);
    }

}