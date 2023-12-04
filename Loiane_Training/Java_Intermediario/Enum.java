import java.util.Scanner;

public class Enum {
    public static void main(String[] args) {

        imprimeDias(1);
        imprimeDias(2);
        imprimeDias(3);
        imprimeDias(4);
        imprimeDias(5);
        imprimeDias(6);
        imprimeDias(7);

        System.out.println();

        imprimeDiasEnum(DiaSemana.DOMINGO);
        imprimeDiasEnum(DiaSemana.SEGUNDA);
        imprimeDiasEnum(DiaSemana.TERCA);
        imprimeDiasEnum(DiaSemana.QUARTA);
        imprimeDiasEnum(DiaSemana.QUARTA);
        imprimeDiasEnum(DiaSemana.QUINTA);
        imprimeDiasEnum(DiaSemana.SEXTA);
        imprimeDiasEnum(DiaSemana.SABADO);
    }

    public static void imprimeDias(int dia) {
        switch (dia) {
            case 1:
                System.out.println("Domingdo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terca");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sabado");
        }
    }

    public static void imprimeDiasEnum(DiaSemana dia) {
        switch (dia) {
            case DOMINGO:
                System.out.println("Domingdo");
                break;
            case SEGUNDA:
                System.out.println("Segunda");
                break;
            case TERCA:
                System.out.println("Terca");
                break;
            case QUARTA:
                System.out.println("Quarta");
                break;
            case QUINTA:
                System.out.println("Quinta");
                break;
            case SEXTA:
                System.out.println("Sexta");
                break;
            case SABADO:
                System.out.println("Sabado");
        }
    }
}

enum DiaSemana {
    DOMINGO, SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA, SABADO
}