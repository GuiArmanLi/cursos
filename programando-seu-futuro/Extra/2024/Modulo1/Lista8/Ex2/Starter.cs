using System;

class Starter
{
    static void Main(string[] args)
    {
        Produto[] produtos = new Produto[4];

        for (int i = 0; i < produtos.Length; i++)
        {
            Console.Write("Nome do {0} produto: ", i + 1);
            string nome = Console.ReadLine();

            Console.Write("Preco do {0} produto: ", i + 1);
            double preco = double.Parse(Console.ReadLine());

            Console.Write("{0} produto disponivel em estoque? ", i + 1);
            bool estaDisponivel = bool.Parse(Console.ReadLine());
            System.Console.WriteLine();

            produtos[i] = new Produto(nome, preco, estaDisponivel);
        }

        for (int i = 0; i < produtos.Length; i++)
        {
            if (produtos[i].DisponivelEmEstoque)
            {
                Console.WriteLine(produtos[i]);
            }
        }
    }
}