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

    static int CalcularFatorial(int x)
    {
        int fatorial = 1;
        for (int i = x; i > 0; i--)
        {
            fatorial *= i;
        }

        return fatorial;
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

        int fatorial = Calculadora.CalcularFatorial(6);
        Console.WriteLine("Fatorial: {0}", fatorial);
    }
}