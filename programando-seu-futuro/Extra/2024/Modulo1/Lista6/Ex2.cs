using System;

class Ex2
{
    static void Main(string[] args)
    {
        string[] listaDeNomes = new string[10];

        for (int i = 0; i < listaDeNomes.GetLength(0); i++)
        {
            Console.WriteLine("Entre com um nome na posicao {0}", i + 1);
            listaDeNomes[i] = Console.ReadLine();
        }

        for (int i = listaDeNomes.GetLength(0) - 1; i >= 0; i--)
        {
            if (i % 2 == 0)
            {
                Console.WriteLine("Posicao {0}, nome: {1}", i, listaDeNomes[i]);
            }
        }
    }
}
