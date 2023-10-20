import java.util.Scanner;

public class Ex37 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        var code = "";
        var codeOfGreaterH = "";
        var codeOfSmallestH = "";
        var codeOfGreaterW = "";
        var codeOfSmallestW = "";

        var height = 0.0;
        var greaterH = 0.0;
        var smallestH = 0.0;

        var weight = 0.0;
        var greaterW = 0.0;
        var smallestW = 0.0;

        for (int i = 1; i == 0;) {
            System.out.println("Qual seu codigo?");
            code = scan.nextLine();

            System.out.println("Qual sua altura?");
            height = scan.nextDouble();

            System.out.println("Qual seu peso?");
            weight = scan.nextDouble();

            if (height > greaterH) {
                greaterH = height;
                codeOfGreaterH = code;
            } else if (height < smallestH) {
                smallestH = height;
                codeOfSmallestH = code;
            }

            if (weight > greaterW) {
                greaterW = weight;
                codeOfGreaterW = code;
            } else if (weight < smallestW) {
                smallestW = weight;
                codeOfSmallestW = code;
            }

            System.out.println("Deseja continuar? \"0\" - No | \"1\" - Yes");
            i = scan.nextInt();
        }

        System.out.println("Cliente mais Alto: " + greaterH + " | Codigo: " + codeOfGreaterH);
        System.out.println("Cliente mais Baixo: " + smallestH + " | Codigo: " + codeOfSmallestH);
        System.out.println("Cliente mais Gordo: " + greaterW + " | Codigo: " + codeOfGreaterW);
        System.out.println("Cliente mais Magro: " + smallestW + " | Codigo: " + codeOfSmallestW);

        scan.close();
    }
}
