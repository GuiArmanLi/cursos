class ContaPoupanca : ContaBancaria
{
    private double DiaRendimento { get; set; }

    public ContaPoupanca(string nomeDoCliente, string numeroDaConta, double saldo, double diaRendimento)
    {
        this.NomeDoCliente = nomeDoCliente;
        this.NumeroDaConta = numeroDaConta;
        this.Saldo = saldo;
        this.DiaRendimento = diaRendimento;
    }

    public void CalcularNovoSaldo(double taxaDeRendimento)
    {
        this.Saldo = this.Saldo + (1 + taxaDeRendimento / 100);
    }

    public new string ToString()
    {
        return "[Cliente: " + this.NomeDoCliente + " | Numero: " + this.NumeroDaConta + " | Saldo: " + this.Saldo + " | Rendimento diario: " + this.DiaRendimento + "%]";
    }
}