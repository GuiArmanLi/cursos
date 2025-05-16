public class Contact {
    private static int contador = 0;
    private int id = 0;
    private String name;
    private String email;

    public Contact() {
        contador++;
        this.id = contador;
    }

    public Contact(String name, String email) {
        contador++;
        this.id = contador;
        this.name = name;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return " { name = " + name + ", email = " + email + " } ";
    }
}