import java.util.Scanner;

public class Ex42 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        var number = 1;
        var count1 = 0;
        var count2 = 0;
        var count3 = 0;
        var count4 = 0;
        while (number > 0) {
            System.out.println("Digite um numero");
            number = scan.nextInt();

            if (number >= 0 && number <= 25) {
                count1++;
            } else if (number > 25 && number <= 50) {
                count2++;
            } else if (number > 50 && number <= 75) {
                count3++;
            } else if (number > 75 && number <= 100) {
                count4++;
            } else if (number > 100) {
                System.out.println("Numero devem ser entre 0 - 100");
            } else {
                System.out.println("Encerrando contagem");
                break;
            }
        }

        System.out.println("0 - 25 - " + count1);
        System.out.println("26 - 50 - " + count2);
        System.out.println("51 - 75 - " + count3);
        System.out.println("76 - 100 - " + count4);
        scan.close();
    }
}
