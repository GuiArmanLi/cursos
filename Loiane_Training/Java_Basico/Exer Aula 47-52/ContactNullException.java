public class ContactNullException extends Exception {
    private String name;

    public ContactNullException(String name) {
        this.name = name;
    }

    @Override
    public String getMessage() {
        return "Contato " + name + " nao existe";
    }
}
