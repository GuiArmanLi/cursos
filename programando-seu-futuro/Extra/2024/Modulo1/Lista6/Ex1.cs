using System;

class Ex1
{
    static void Main(string[] args)
    {
        string[] listaDeNomes = new string[10];

        for (int i = 0; i < listaDeNomes.GetLength(0); i++)
        {
            Console.Write("Entre com um nome na posicao {0}: ", i + 1);
            listaDeNomes[i] = Console.ReadLine();
        }

        Console.Write("Digite um nome para buscar na lista: ");
        string nomeDaBusca = Console.ReadLine();

        string resultado = "Nao achei";
        for (int i = 0; i < listaDeNomes.GetLength(0); i++)
        {
            if (listaDeNomes[i] == nomeDaBusca)
            {
                resultado = "Achei";
            }
        }

        Console.WriteLine(resultado);
    }
}
