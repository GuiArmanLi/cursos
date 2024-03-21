using System;

class Ex14
{
    static void Main(string[] args)
    {
        int quantidadePares = 0;
        for (int i = 0; i < 10; i++)
        {
            Console.WriteLine($"Digite {i + 1} o numero ");
            int number = int.Parse(Console.ReadLine());
            if (number % 2 == 0)
            {
                quantidadePares++;
            }
        }

        Console.WriteLine($"Pares: {quantidadePares} | Impares: {10 - quantidadePares}");
    }
}