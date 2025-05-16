using System;

class Calculadora
{
    static double Somar(double x, double y)
    {
        return x + y;
    }

    static double Subtrair(double x, double y)
    {
        return x - y;
    }

    static double Multiplicar(double x, double y)
    {
        return x * y;
    }

    static double Dividir(double x, double y)
    {
        return x / y;
    }

    static double Elevacao(double _base, double expoente)
    {
        return Math.Pow(_base, expoente);
    }

    static void Main(string[] args)
    {
        double soma = Calculadora.Somar(5, 5);
        Console.WriteLine("Soma: " + soma);

        double subtracao = Calculadora.Subtrair(5, 5);
        Console.WriteLine("Subtracao: " + subtracao);

        double multiplicacao = Calculadora.Multiplicar(5, 5);
        Console.WriteLine("Multiplicacao: " + multiplicacao);

        double divisao = Calculadora.Dividir(5, 5);
        Console.WriteLine("Divisao: " + divisao);

        double potenciacao = Calculadora.Elevacao(5, 5);
        Console.WriteLine("Potenciacao: " + potenciacao);
    }
}