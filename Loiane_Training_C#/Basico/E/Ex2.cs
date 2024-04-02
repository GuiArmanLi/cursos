using System;

class Ex2
{
    static void Main(string[] args)
    {
        int[] vetorA = new int[8] { 1, 2, 3, 4, 5, 6, 7, 8 };

        int[] vetorB = new int[8];

        for (int i = 0; i < vetorA.GetLength(0); i++)
        {
            vetorB[i] = vetorA[i] * 2;
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