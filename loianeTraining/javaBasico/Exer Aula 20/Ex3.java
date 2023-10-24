import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[][] matriz = new int[3][3];
        for (int line = 0; line < matriz.length; line++) {
            for (int column = 0; column < matriz.length; column++) {
                matriz[line][column] = scan.nextInt();
            }
        }
        System.out.println();
        
        var even = 0;
        var odd = 0;
        for (int line = 0; line < matriz.length; line++) {
            for (int column = 0; column < matriz.length; column++) {
                System.out.print(matriz[line][column] + " ");
                if (matriz[line][column] % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            }
            System.out.println();
        }

        System.out.println(even + " Pares");
        System.out.println(odd + " Impares");
        scan.close();
    }
}
