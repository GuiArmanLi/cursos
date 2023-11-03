public class Contact {
    private String name;
    private Phone phones[];
    private Email emails[];

    public Contact(String name, Phone[] telefones, Email[] email) {
        this.name = name;
        this.phones = telefones;
        this.emails = email;
    }

    public Contact() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Phone[] getPhones() {
        return phones;
    }

    public void setPhones(Phone[] phones) {
        this.phones = phones;
    }

    public Email[] getEmails() {
        return emails;
    }

    public void setEmails(Email[] email) {
        this.emails = email;
    }

}