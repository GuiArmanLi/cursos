import java.text.DecimalFormat;

public class Teste {

    public static void main(String[] args) {
        DecimalFormat format = new DecimalFormat("###,###.##");
        SavingAccount savingAccount = new SavingAccount("Gabriel", 2, 15000, 8);
        SpecialAccount specialAccount = new SpecialAccount("Guilherme", 3, 1200, 300);

        System.out.println("Conta poupanca do " + savingAccount.getClientName());

        System.out.println("Saldo: " + format.format(savingAccount.getBalance()));
        savingAccount.withdraw(500);
        System.out.println("Saldo: " + format.format(savingAccount.getBalance()));

        savingAccount.deposit(800);
        System.out.println("Saldo: " + format.format(savingAccount.getBalance()));

        var newBalance = savingAccount.calculateNewBalance(8);
        System.out.println("Rendimento diario: " + newBalance);

        System.out.println(savingAccount.toString());

        System.out.println("======================================================================");
        System.out.println("Conta especial do " + specialAccount.getClientName());

        System.out.println("Saldo: " + format.format(specialAccount.getBalance()));
        specialAccount.withdraw(200);
        System.out.println("Saldo: " + format.format(specialAccount.getBalance()));

        specialAccount.deposit(400);
        System.out.println("Saldo: " + format.format(specialAccount.getBalance()));

        System.out.println(specialAccount.toString());
    }
}
