using System;

class Starter
{
    static void Main(string[] args)
    {
        ContaPoupanca contaPoupanca = new ContaPoupanca("Guilherme", "13579", 800.50, 80);
        Console.WriteLine(contaPoupanca.ToString());

        ContaEspecial contaEspecial = new ContaEspecial("Gabriel", "08642", 1600.50, 400);
        Console.WriteLine(contaEspecial.ToString());

        double valorDoSaquePoupanca = contaPoupanca.Sacar(300.50);
        Console.WriteLine("Saque poupanca: {0}", valorDoSaquePoupanca);
        Console.WriteLine(contaPoupanca.ToString());

        double valorDoSaqueEspecial = contaEspecial.Sacar(600.50);
        Console.WriteLine("Saque especial: {0}", valorDoSaqueEspecial);
        Console.WriteLine(contaEspecial.ToString());


        contaPoupanca.Depositar(50);
        Console.WriteLine(contaPoupanca.ToString());

        contaEspecial.Depositar(200);
        Console.WriteLine(contaEspecial.ToString());

        contaPoupanca.CalcularNovoSaldo(80);
        Console.WriteLine(contaPoupanca.ToString());

    }
}