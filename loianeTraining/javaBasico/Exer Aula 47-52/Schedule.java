import java.util.Scanner;

public class Schedule {
    private Contact[] contacts = new Contact[5];

    public Contact[] getContacts() {
        return contacts;
    }

    @Override
    public String toString() {
        String array = "Agenda [\n";
        for (Contact contact : contacts) {
            array += contact + "\t";
        }
        return array += "\n]";
    }

    public void addContact() {
        try {
            addContactLogic();
        } catch (ScheduleFullException error) {
            error.getMessage();
        }
    }

    private void addContactLogic() throws ScheduleFullException {
        Contact contact = createContact();
        boolean isScheduleFull = true;
        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i] == null) {
                contacts[i] = contact;
                isScheduleFull = false;
                break;
            }
        }
        if (isScheduleFull) {
            throw new ScheduleFullException();
        }
    }

    private Contact createContact() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do Contato");
        String name = scanner.next();
        System.out.println("Digite o email do Contato");
        String email = scanner.next();

        Contact contact = new Contact(name, email);
        scanner.close();
        return contact;
    }

    public void queryContacts(Schedule schedule) {
        try {
            System.out.println(schedule.toString());
        } catch (NullPointerException error) {
            error.getMessage();
        }
    }

    public void queryContactByName(Schedule schedule, Scanner scan) {
        try {
            queryContactByNameLogic(schedule, scan);
        } catch (ContactNullException error) {
            error.getMessage();
        }
    }

    private void queryContactByNameLogic(Schedule schedule, Scanner scan) throws ContactNullException {
        System.out.println("Digite o nome para consultar");
        String name = scan.nextLine();

        for (Contact contact : schedule.getContacts()) {
            if (contact != null) {
                if (contact.getName().equalsIgnoreCase(name)) {
                    System.out.println(contact.toString());
                }
            }
        }
        throw new ContactNullException(name);
    }
}
