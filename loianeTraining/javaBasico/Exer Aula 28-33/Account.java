import java.util.Scanner;
import java.util.UUID;

public class Account {
    private UUID number = UUID.randomUUID();
    private double leftover;
    private boolean special;
    private double limit;

    Account() {
    }

    Account(double leftover, boolean special, double limit) {
        this.leftover = leftover;
        this.special = special;
        this.limit = limit;
    }

    public UUID getNumber() {
        return number;
    }

    public double getLeftover() {
        return leftover;
    }

    public void setLeftover(double leftover) {
        this.leftover = leftover;
    }

    public boolean isSpecial() {
        return special;
    }

    public void setSpecial(boolean special) {
        this.special = special;
    }

    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }

    public void bankDraft(double withdraw) {
        if (leftover - withdraw > 0) {
            setLeftover(leftover -= withdraw);
            System.out.println("Saque de " + withdraw);
        } else if (leftover - withdraw < 0 && special) {
            setLeftover(leftover -= withdraw);
            System.out.println("Saque de " + withdraw + ". Voce esta devendo " + getLeftover());
        } else {
            System.out.println("Saldo Insuficiente. Saque maximo = " + getLeftover());
        }
    }

    public void deposit(double deposit) {
        setLeftover(leftover += deposit);
    }

    public String verifyLeftover() {
        return "Saldo: " + getLeftover();
    }

    public boolean verifyCardCondition() {
        return isSpecial();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Account conta = new Account(1200, true, 5000);

        var useMachine = true;
        int operation;
        while (useMachine) {
            System.out.println("\"1\" - Sacar");
            System.out.println("\"2\" - Depositar");
            System.out.println("\"3\" - Verificar Saldo");
            System.out.println("\"4\" - Verificar Status do Cartao");

            operation = scan.nextInt();

            switch (operation) {
                case 1:
                    System.out.println("Digite o valor a sacar");
                    var withdraw = scan.nextDouble();
                    conta.bankDraft(withdraw);
                    break;
                case 2:
                    System.out.println("Digite o valor que deseja depositar");
                    double depositValue = scan.nextDouble();
                    conta.deposit(depositValue);
                    break;
                case 3:
                    System.out.println(conta.verifyLeftover());
                    break;
                case 4:
                    System.out.println(conta.verifyCardCondition());
                    break;
                default:
                    System.out.println("Operacao invalida");
                    break;
            }

            System.out.println("Gostaria de realizar outra operacao? Y or N");
            var newOperation = scan.nextLine();
            scan.nextLine();

            if (newOperation.equalsIgnoreCase("N")) {
                useMachine = false;
            }
        }
        scan.close();
    }
}
