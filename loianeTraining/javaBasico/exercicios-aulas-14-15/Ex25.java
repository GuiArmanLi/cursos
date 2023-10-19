import java.util.Scanner;

public class Ex25 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Responda o questionario: \"y\" - Yes | \"n\" - No");
        var score = 0;
        var response = "";

        System.out.println("Telefonou para vitima?");
        response = scan.next();
        if (response.equalsIgnoreCase("y")) { score++; }

        System.out.println("Esteve no local do crime?");
        response = scan.next();
        if (response.equalsIgnoreCase("y")) { score++; }

        System.out.println("Mora perto da vitima?");
        response = scan.next();
        if (response.equalsIgnoreCase("y")) { score++; }

        System.out.println("Devia para vitima?");
        response = scan.next();
        if (response.equalsIgnoreCase("y")) { score++; }

        System.out.println("Ja trabalhou com a vitima?");
        response = scan.next();
        if (response.equalsIgnoreCase("y")) { score++; }

        var result = "";
        if (score == 2) {
            result = "Suspeita";
        } else if (score == 3 || score == 4) {
            result = "Cumplice";
        } else if (score == 5) {
            result = "Assasino";
        } else {
            result = "Inocente";
        }

        System.out.println("Voce e " + result);
        scan.close();
    }
}
