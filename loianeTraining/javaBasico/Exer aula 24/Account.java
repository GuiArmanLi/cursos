import java.util.UUID;

public class Account {
    UUID number = UUID.randomUUID();
    double leftover;
    boolean special;
    double limit;

    public static void main(String[] args) {
        Account example = new Account();

        example.leftover = 300;
        example.special = false;
        example.limit = 5000;

        System.out.println("Numero da conta: " + example.number);
        System.out.println("Saldo: " + example.leftover);
        System.out.println("Conta especial?: " + example.special);
        System.out.println("Limite: " + example.limit);
    }
}
