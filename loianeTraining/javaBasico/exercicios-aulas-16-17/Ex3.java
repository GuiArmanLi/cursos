import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        var name = "";
        var age = 0;
        double salary = 0;
        String gender = "";
        var maritalStatus = "";
        boolean repeat = true;

        do {
            System.out.println("Digite seu Nome");
            name = scan.nextLine();
            if (name.length() > 3) {
                repeat = false;
            } else {
                repeat = true;
            }
        } while (repeat);

        do {
            System.out.println("Digite sua idade");
            age = scan.nextInt();
            if (age < 0 || age > 150) {
                System.out.println(repeat);
                repeat = true;
            } else {
                repeat = false;
            }

        } while (repeat);

        do {
            System.out.println("Digite seu salario");
            salary = scan.nextDouble();
            if (salary > 0) {
                repeat = false;
            } else {
                repeat = true;
            }

        } while (repeat);

        do {
            System.out.println("Digite seu genero");
            gender = scan.nextLine();
            if (gender.equalsIgnoreCase("f") || gender.equalsIgnoreCase("m")) {
                repeat = false;
            } else {
                repeat = true;
            }
        } while (repeat);

        do {
            System.out.println("Digite seu estado civil");
            maritalStatus = scan.nextLine();
            switch (maritalStatus) {
                case "s":
                case "c":
                case "v":
                case "d":
                    repeat = false;
                    break;
                default:
                    System.out.println("Entrada Invalida");
                    repeat = true;
            }
        } while (repeat);

        System.out.println("Informacoes coletadas: ");
        System.out.println("Nome: " + name);
        System.out.println("Idade: " + age);
        System.out.println("Salario: " + salary);
        System.out.println("Genero: " + gender);
        System.out.println("Estado Civil: " + maritalStatus);
        scan.close();
    }
}
