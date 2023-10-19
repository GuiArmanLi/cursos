import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        var name = "";
        var age = 0;
        double salary = 0;
        String gender = "";
        var maritalStatus = "";
        boolean repeat = false;

        do {
            System.out.println("Digite seu Nome");
            name = scan.nextLine();
            if (name.length() < 3) {
                repeat = true;
            }

            System.out.println("Digite sua idade");
            age = scan.nextInt();
            if (age < 0 || age > 150) {
                repeat = true;
            }

            System.out.println("Digite seu salario");
            salary = scan.nextDouble();
            if (salary < 0) {
                repeat = true;
            }

            scan.nextLine();

            System.out.println("Digite seu genero");
            gender = scan.nextLine();
            if (!(gender.equalsIgnoreCase("f") || gender.equalsIgnoreCase("m"))) {
                repeat = true;
            }

            System.out.println("Digite seu estado civil");
            maritalStatus = scan.nextLine();
            switch (maritalStatus) {
                case "s":
                case "c":
                case "v":
                case "d":
                    break;
                default:
                    System.out.println("Entrada Invalida");
                    repeat = true;
            }
        } while (repeat);

        System.out.println(repeat);
        scan.close();
    }
}
