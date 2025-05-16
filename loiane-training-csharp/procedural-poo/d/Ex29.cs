using System;

class Ex29
{
    static void Main(string[] args)
    {
        Console.WriteLine("Loja Quase Dois - Tabela de Precos");

        double preco = 1.99;
        for (int i = 0; i < 50; i++)
        {
            Console.WriteLine("{0} - R$ {1}", (i + 1), preco);
            preco += 1.99;
        }
    }
}