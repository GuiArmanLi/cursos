import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o nome da Agenda");
        Schedule schedule = new Schedule(scan.nextLine(), null);

        Contact contacts[] = new Contact[3];
        for (int i = 0; i < contacts.length; i++) {
            Phone phones[] = new Phone[2];
            Email emails[] = new Email[2];

            System.out.println("Entre com o Nome do " + (i + 1) + " contato");
            var name = scan.nextLine();

            for (int j = 0; j < phones.length; j++) {
                System.out.println("DDD e numero do contato " + (j + 1) + " separadamente");
                phones[j] = new Phone(scan.nextLine(), scan.nextLine());
            }

            for (int j = 0; j < emails.length; j++) {
                System.out.println("Entre com " + (j + 1) + " Email do " + (i + 1) + " contato");
                emails[j] = new Email(scan.nextLine());
            }

            Contact contact = new Contact(name, phones, emails);
            contacts[i] = contact;
        }

        schedule.setContacts(contacts);

        System.out.println("Membros da agenda");
        for (Contact contact : schedule.getContacts()) {
            System.out.print(contact.getName() + " -");

            for (Phone phone : contact.getPhones()) {
                System.out.print(" " + phone.getDdd() + " " + phone.getNumber() + " ");
            }

            for (Email email : contact.getEmails()) {
                System.out.print(" | " + email.getEmail());
            }
        }
        scan.close();
    }
}
