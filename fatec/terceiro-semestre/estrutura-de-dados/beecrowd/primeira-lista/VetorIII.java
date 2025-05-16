import java.io.IOException;
import java.util.Scanner;
 
public class VetorIII {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        
        double[] vetor = new double[100];
        var entrada = scan.nextDouble();
        
        vetor[0] = entrada;
        for(int i = 1; i < vetor.length; i++){
            var metade = vetor[i - 1] / 2;
            vetor[i] = metade;
        }
        
        for(int i = 0; i < vetor.length; i++){
            System.out.printf("N[%s] = %.4f\n", i, vetor[i]);
        }
    }
}