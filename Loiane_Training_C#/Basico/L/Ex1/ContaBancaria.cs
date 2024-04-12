class ContaBancaria
{
    public string NomeDoCliente { get; set; }
    public string NumeroDaConta { get; set; }
    public double Saldo { get; set; }

    public double Sacar(double valor)
    {
        if (this.Saldo - valor > 0)
        {
            this.Saldo -= valor;
            return valor;
        }

        return 0;
    }

    public void Depositar(double valor)
    {
        this.Saldo += valor;
    }
}