import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Schedule schedule = new Schedule();

        boolean isRepeating = true;
        while (isRepeating) {
            System.out.println("\n1 - Consultar Contatos\t\t2 - Consultar Contato por Nome\t\t3 - Adicionar Contato");
            int option = scan.nextInt();
            switch (option) {
                case 1:
                    schedule.queryContacts(schedule);
                    break;
                case 2:
                    schedule.queryContactByName(schedule, scan);
                    break;
                case 3:
                    schedule.addContact(scan);
                    break;
                default:
                    System.out.println("Opcao Invalida");
            }

            System.out.println("\n\n1 - Nova Operacao\t\t2 - Encerrar programa");
            int anotherOperation = scan.nextInt();
            if (anotherOperation == 2) {
                isRepeating = false;
                scan.close();
            }
        }
    }
}
