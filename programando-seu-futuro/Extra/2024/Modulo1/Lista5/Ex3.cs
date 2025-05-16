using System;

class Ex3
{
    static void Main(string[] args)
    {
        Console.Write("Digite o tamanho da base do retangulo: ");
        int _base = int.Parse(Console.ReadLine());

        Console.Write("Digite o tamanho da altura do retangulo: ");
        int altura = int.Parse(Console.ReadLine());

        for (int i = 0; i < altura; i++)
        {
            for (int j = 0; j < _base; j++)
            {
                Console.Write("*");
            }
            Console.WriteLine();
        }
    }
}