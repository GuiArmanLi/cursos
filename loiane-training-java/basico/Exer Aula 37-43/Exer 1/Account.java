class Account {
    private String clientName;
    private int accountNumber;
    private double balance;

    public Account() {
    }

    public Account(String clientName, int accountNumber, double balance) {
        this.clientName = clientName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account [clientName=" + clientName + ", accountNumber=" + accountNumber + ", balance=" + balance + "]";
    }

    public void withdraw(double withdraw) {
        if (getBalance() - withdraw < 0) {
            System.out.println("Saldo Insuficiente.\tSaldo Atual: " + getBalance());
        } else {
            setBalance(getBalance() - withdraw);
            System.out.println("Saque de " + withdraw);
        }
    }

    public void deposit(double deposit) {
        setBalance(getBalance() + deposit);
    }
}