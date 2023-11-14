import java.util.Scanner;

public class Schedule {
    private Contact[] contacts = new Contact[5];

    public Contact[] getContacts() {
        return contacts;
    }

    @Override
    public String toString() {
        String array = "Agenda [ ";
        for (Contact contact : contacts) {
            if (contact != null) {
                array += contact;
            }
        }
        return array += " ]";
    }

    public void addContact(Scanner scan) {
        try {
            addContactLogic(scan);
        } catch (ScheduleFullException error) {
            System.out.println(error.getMessage());
        }
    }

    private void addContactLogic(Scanner scan) throws ScheduleFullException {
        Contact contact = createContact(scan);
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

    private Contact createContact(Scanner scan) {
        System.out.println("Digite o nome do Contato");
        String name = scan.next();
        System.out.println("Digite o email do Contato");
        String email = scan.next();

        return new Contact(name, email);
    }

    public void queryContacts(Schedule schedule) {
        try {
            System.out.println(schedule.toString());
        } catch (NullPointerException error) {
            System.out.println(error.getMessage());
        }
    }

    public void queryContactByName(Schedule schedule, Scanner scan) {
        try {
            String contact = queryContactByNameLogic(schedule, scan);
            System.out.println(contact);
        } catch (ContactNullException error) {
            System.out.println(error.getMessage());
        }
    }

    private String queryContactByNameLogic(Schedule schedule, Scanner scan) throws ContactNullException {
        System.out.println("Digite o nome para consultar");
        String name = scan.next();

        for (Contact contact : schedule.getContacts()) {
            if (contact != null && (contact.getName().equalsIgnoreCase(name))) {
                return contact.toString();
            }
        }
        throw new ContactNullException(name);
    }
}
