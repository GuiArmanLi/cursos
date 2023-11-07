public class SavingAccount extends Account {
    private double incomeDay;

    public SavingAccount() {
    }

    public SavingAccount(double incomeDay) {
        this.incomeDay = incomeDay;
    }

    public SavingAccount(String clientName, int accountNumber, double balance, double incomeDay) {
        super(clientName, accountNumber, balance);
        this.incomeDay = incomeDay;
    }

    public double getIncomeDay() {
        return incomeDay;
    }

    public void setIncomeDay(double incomeDay) {
        this.incomeDay = incomeDay;
    }

    @Override
    public String toString() {
        return "SavingAccount [incomeDay=" + incomeDay + "]";
    }

    public double calculateNewBalance(double incomeTax) {
        return getBalance() * (incomeTax / 100) / 12;
    }
}
