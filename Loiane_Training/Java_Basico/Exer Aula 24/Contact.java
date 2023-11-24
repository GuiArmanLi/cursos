public class Contact {
    String phoneNumber;
    String name;
    String lastName;

    public static void main(String[] args) {
        Contact paulo = new Contact();

        paulo.phoneNumber = "11 94698-3467";
        paulo.name = "Paulo";
        paulo.lastName = "Leal";

        System.out.println("Nome: " + paulo.name + " " + paulo.lastName);
        System.out.println("Telefone: " + paulo.phoneNumber);
    }
}
