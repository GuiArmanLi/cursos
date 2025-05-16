class ContaEspecial : ContaBancaria
{
    private double Limite { get; set; }

    public ContaEspecial(string nomeDoCliente, string numeroDaConta, double saldo, double limite)
    {
        this.NomeDoCliente = nomeDoCliente;
        this.NumeroDaConta = numeroDaConta;
        this.Saldo = saldo;
        this.Limite = limite;
    }

    public new double Sacar(double valor)
    {
        if ((this.Saldo + this.Limite) - valor > 0)
        {
            this.Saldo = this.Saldo - valor;
            return valor;
        }

        return 0;
    }

    public new string ToString()
    {
        return "[Cliente: " + this.NomeDoCliente + " | Numero: " + this.NumeroDaConta + " | Saldo: " + this.Saldo + " | Limite: " + this.Limite + "]";
    }
}