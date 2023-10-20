import java.util.Scanner;

public class Ex25 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite quantas pessoas irao participar da entrevista");
        var people = scan.nextInt();

        var age = 0;
        var sumOfAges = 0;
        for (int i = 0; i < people; i++) {
            System.out.println("Digite sua idade");
            age = scan.nextInt();

            if (age < 0 || age > 110) {
                System.out.println("Idade invalida");
                break;
            }
            sumOfAges += age;
        }

        var average = sumOfAges / people;

        if (average > 0 && average < 25) {
            System.out.println("A maioria e Jovem");
        } else if (average > 25 && average < 65) {
            System.out.println("A maioria e Adulto");
        } else {
            System.out.println("A maioria sao idosos");
        }
        scan.close();
    }
}
