package model;

public class Contact {

    private String name;
    private String telephone;
    private String email;

    public Contact() {
    }

    public Contact(String nome, String telefone, String email) {
        super();
        this.name = nome;
        this.telephone = telefone;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contato [nome=" + name + ", telefone=" + telephone + ", email="
                + email + "]";
    }
}