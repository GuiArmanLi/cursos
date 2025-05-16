import java.io.IOException;
import java.util.Scanner;

public class VetorIV {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        int[] par = new int[5];
        int[] impar = new int[5];
        for (int i = 0, cpar = 0, cimpar = 0; i < 15; i++) {
            var entrada = scan.nextInt();

            if (entrada % 2 == 0) {
                par[cpar] = entrada;
                cpar++;
            } else {
                impar[cimpar] = entrada;
                cimpar++;
            }

            if (par[4] != 0) {
                for (int j = 0; j < par.length; j++) {
                    System.out.printf("par[%s] = %s\n", j, par[j]);
                }

                par = new int[5];
                cpar = 0;
            }

            if (impar[4] != 0) {
                for (int j = 0; j < impar.length; j++) {
                    System.out.printf("impar[%s] = %s\n", j, impar[j]);
                }

                impar = new int[5];
                cimpar = 0;
            }
        }

        for (int j = 0; j < impar.length; j++) {
            if (impar[j] != 0)
                System.out.printf("impar[%s] = %s\n", j, impar[j]);
        }

        for (int j = 0; j < par.length; j++) {
            if (par[j] != 0)
                System.out.printf("par[%s] = %s\n", j, par[j]);
        }
    }
}