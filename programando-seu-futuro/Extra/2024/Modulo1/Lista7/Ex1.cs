using System;

class Ex1
{
    static void Main(string[] args)
    {
        bool retorno = VerificaSeEPar(int.Parse(args[0]));
        Console.WriteLine("Par? {0}", retorno);
    }

    static bool VerificaSeEPar(int numero)
    {
        return numero % 2 == 0;
    }
}