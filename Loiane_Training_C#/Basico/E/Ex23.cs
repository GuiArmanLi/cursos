using System;

class Ex23
{
    static void Main(string[] args)
    {
        double[] vetorA = new double[3]; // So mudar para 10 que a probabilidade de ser todos pares se potencializa

        Random random = new Random();
        Console.Write("\nVetor A: ");

        for (int i = 0; i < vetorA.GetLength(0); i++)
        {
            vetorA[i] = random.Next(0, 11);
            if (vetorA[i] % 2 == 1)
            {
                return;
            }

            Console.Write(" " + vetorA[i]);
        }

        Console.WriteLine("\nNenhum impar no vetor!");
    }
}