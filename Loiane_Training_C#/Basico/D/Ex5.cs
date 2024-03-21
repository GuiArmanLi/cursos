using System;

class Ex4
{
    static void Main(string[] args)
    {
        Console.WriteLine("Digite a quantidade de habitantes na cidade A");
        double populacaoA = double.Parse(Console.ReadLine());
        Console.WriteLine("Digite a quantidade de habitantes na cidade B");
        double populacaoB = double.Parse(Console.ReadLine());

        Console.WriteLine("Digite a taxa de crescimento na cidade A");
        double taxaA = double.Parse(Console.ReadLine());
        Console.WriteLine("Digite a taxa de crescimento na cidade B");
        double taxaB = double.Parse(Console.ReadLine());
        int anosPercorridos = 0;
        while (true)
        {
            populacaoA *= taxaA;
            populacaoB *= taxaB;
            anosPercorridos++;
            if (populacaoA > populacaoB)
            {
                break;
            }
        }
        Console.WriteLine($"Levaram {anosPercorridos} para a populacao A passar da B");
    }
}