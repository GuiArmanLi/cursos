import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        var number = scan.nextInt();

        if (number > 1000 && number < 0) {
            System.out.println("Numero invalido");
            scan.close();
            return;
        }

        var centenas = number / 100;
        var dezenas = number % 100 / 10;
        var unidades = number % 10 / 1;

        switch (centenas) {
            case 0:
                break;

            case 1:
                System.out.print(centenas + " centena");
                if (dezenas > 0 && unidades > 0) {
                    System.out.print(", ");
                } else if (dezenas > 0 || unidades > 0) {
                    System.out.print(" e ");
                }
                break;

            default:
                System.out.print(centenas + " centenas");
                if (dezenas > 0 && unidades > 0) {
                    System.out.print(", ");
                } else if (dezenas > 0 || unidades > 0) {
                    System.out.print(" e ");
                }
        }

        switch (dezenas) {
            case 0:
                break;

            case 1:
                System.out.print(dezenas + " dezena");
                if (unidades > 0) {
                    System.out.print(" e ");
                }
                break;

            default:
                System.out.print(dezenas + " dezenas");
                if (unidades > 0) {
                    System.out.print(" e ");
                }
        }

        switch (unidades) {
            case 0:
                break;

            case 1:
                System.out.print(unidades + " unidade");
                break;

            default:
                System.out.print(unidades + " unidades");
        }

        // if (centenas == 0) {
        // System.out.print("");
        // } else if (centenas == 1) {
        // System.out.print(centenas + " centena");
        // if (dezenas > 0 && unidades > 0) {
        // System.out.print(", ");
        // } else if (dezenas > 0 || unidades > 0) {
        // System.out.print(" e ");
        // }
        // } else {
        // System.out.print(centenas + " centenas");
        // if (dezenas > 0 && unidades > 0) {
        // System.out.print(", ");
        // } else if (dezenas > 0 || unidades > 0) {
        // System.out.print(" e ");
        // }
        // }

        // if (dezenas == 0) {
        // System.out.print("");
        // } else if (dezenas == 1) {
        // System.out.print(dezenas + " dezena");
        // if (unidades > 0) {
        // System.out.print(" e ");
        // }
        // } else {
        // System.out.print(dezenas + " dezenas");
        // if (unidades > 0) {
        // System.out.print(" e ");
        // }
        // }

        // if (unidades == 0) {
        // System.out.print("");
        // } else if (unidades == 1) {
        // System.out.print(unidades + " unidade");
        // } else {
        // System.out.print(unidades + " unidades");
        // }
        scan.close();
    }
}
