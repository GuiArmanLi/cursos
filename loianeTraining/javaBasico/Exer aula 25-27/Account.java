import java.util.UUID;

public class Account {
    UUID number = UUID.randomUUID();
    double leftover;
    boolean special;
    double limit;

    public void bankDraft(double withdraw) {
        if (this.leftover < 0) {
            System.out.println("Sem saldo");
        } else if (this.leftover < withdraw) {
            System.out.println("Toma " + (this.leftover - withdraw) + " seu pobre");
        } else {
            System.out.println("Toma " + withdraw);
        }
    }

    public void deposit(int deposit) {
        this.leftover += deposit;
    }

    public String verifyLeftover() {
        return "Saldo: " + this.leftover;
    }

    public boolean verifyCardCondition() {
        return this.special;
    }

    public static void main(String[] args) {
        Account nubank = new Account();

        nubank.leftover = -100;
        nubank.limit = 500;
        nubank.special = true;

        System.out.println("Guilherme chega ao caixa eletronico");
        System.out.println("Guilherme deseja sacar todo o dinheiro que tem");
        nubank.bankDraft(nubank.leftover);

        System.out.println("Seleciona a opcao de consulta de saldo");
        System.out.println(nubank.verifyLeftover());

        System.out.println("Guilherme tem toque com o numero 100, ele deposita R$100");
        nubank.deposit(100);

        System.out.println("Guilherme quer comprar um tenis, mas quer usar cheque especial");
        if (nubank.special) {
            System.out.println("Guilherme consegue comprar o tenis");
        } else {
            System.out.println("Guilherme nao consegue comprar o tenis");
        }
    }
}
