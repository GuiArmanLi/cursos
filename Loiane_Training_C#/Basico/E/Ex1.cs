using System;

class Ex1
{
    static void Main(string[] args)
    {
        int[] vetorA = new int[5] { 1, 2, 3, 4, 5 };

        int[] vetorB = new int[5];

        for (int i = 0; i < vetorA.GetLength(0); i++)
        {
            vetorB[i] = vetorA[i];
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