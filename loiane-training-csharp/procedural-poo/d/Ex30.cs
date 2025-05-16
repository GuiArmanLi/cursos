using System;

class Ex30
{
    static void Main(string[] args)
    {
        Console.WriteLine("Preco do Pao: R$ 0.18");
        Console.WriteLine("Panificadora Pao de Ontem - Tabela de Precos");

        double preco = 0.18;
        for (int i = 0; i < 50; i++)
        {
            Console.WriteLine("{0} - R$ {1}", (i + 1), preco);
            preco += 0.18;
        }
    }
}