using System;

class Ex4
{
    static void Main(string[] args)
    {
        double[] vetorA = new double[15] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };

        double[] vetorB = new double[15];

        for (int i = 0; i < vetorA.GetLength(0); i++)
        {
            vetorB[i] = Math.Sqrt(vetorA[i]);
        }

        Console.Write("\nVetor A: ");
        for (int i = 0; i < vetorA.GetLength(0); i++)
        {
            Console.Write(vetorA[i] + " ");
        }

        Console.Write("\nVetor B: ");
        for (int i = 0; i < vetorA.GetLength(0); i++)
        {
            Console.Write(vetorB[i] + " ");
        }
    }
}