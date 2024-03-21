using System;

class Ex4
{
    static void Main(string[] args)
    {

        double populacaoA = 80000;
        double populacaoB = 200000;
        int anosPercorridos = 0;
        while (true)
        {
            populacaoA *= 1.03;
            populacaoB *= 1.015;
            anosPercorridos++;
            if (populacaoA > populacaoB)
            {
                break;
            }
        }
        Console.WriteLine($"Levaram {anosPercorridos} para a populacao A passar da B");
    }
}