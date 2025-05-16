using System;

class Ex2
{
    static void Main(string[] args)
    {
        Console.Write("Deseja realizar a soma de 1 ate qual numero? ");
        int limiteDaSoma = int.Parse(Console.ReadLine());

        int soma = somarValoresAteLimite(limiteDaSoma);
        Console.WriteLine("Valor da soma: {0}", soma);
    }

    static int somarValoresAteLimite(int limiteDaSoma)
    {
        if (limiteDaSoma == 1)
        {
            return 1;
        }
        return somarValoresAteLimite(limiteDaSoma - 1) + limiteDaSoma;
    }
}