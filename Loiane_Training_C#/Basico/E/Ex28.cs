using System;

class Ex28
{
    static void Main(string[] args)
    {
        int[] vetorA = new int[10] { 6, 20, 10, 4, 7, 5, 4, 8, 2, 2 };
        int[] vetorB = new int[10];

        for (int i = vetorA.Length - 1, j = 0; i >= 0; i--, j++)
        {
            vetorB[j] = vetorA[i];
        }

        for (int i = 0; i < vetorA.Length; i++)
        {
            Console.Write(vetorA[i] + " ");
        }

        System.Console.WriteLine();

        for (int i = 0; i < vetorA.Length; i++)
        {
            Console.Write(vetorB[i] + " ");
        }
    }
}