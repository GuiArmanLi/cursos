using System;

class Ex2
{
    static void Main(string[] args)
    {
        int retorno = VerificaMaiorNumero(args);
        Console.WriteLine("Maior numero: {0}", retorno);
    }

    static int VerificaMaiorNumero(string[] args)
    {
        int maiorNumero = int.MinValue;
        for (int i = 0; i < args.Length; i++)
        {
            int numero = int.Parse(args[i]);
            if (numero > maiorNumero)
            {
                maiorNumero = numero;
            }
        }

        return maiorNumero;
    }
}