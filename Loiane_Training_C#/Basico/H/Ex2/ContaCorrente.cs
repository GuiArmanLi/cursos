using System;

class ContaCorrente
{
    long number;
    double balance;
    bool isSpecial;
    double limit;

    ContaCorrente() { }

    ContaCorrente(
        long number,
        double balance,
        bool isSpecial,
        double limit)
    {
        this.number = number;
        this.balance = balance;
        this.isSpecial = isSpecial;
        this.limit = limit;
    }

    public void WithDraw(double value)
    {
        if (this.balance - value > 0)
        {
            this.balance -= value;
        }
    }

    public void Deposit(double value)
    {
        this.balance += value;
    }

    public void VerifyBalance()
    {
        Console.WriteLine("Saldo: " + this.balance);
    }

    public void VerifyIfIsSpecial()
    {
        string result = this.isSpecial ? "Conta especial!" : "Conta nao especial!";
        Console.WriteLine(result);
    }

    static void Main(string[] args)
    {
        ContaCorrente contaCorrente = new ContaCorrente(3, 600, false, 200);

        contaCorrente.VerifyIfIsSpecial();
        contaCorrente.VerifyBalance();

        contaCorrente.Deposit(100);
        contaCorrente.VerifyBalance();

        contaCorrente.WithDraw(400);
        contaCorrente.VerifyBalance();
    }
}
