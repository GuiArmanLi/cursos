using System;

class Ex29
{
    static void Main(string[] args)
    {
        int[] vetorA = new int[10] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] vetorB = new int[10] { 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
        int[] vetorC = new int[20];

        int a = 0;
        for (int i = 0; i < 20; i++)
        {
            if (i < 10)
            {
                vetorC[i] = vetorA[i];
            }
            else
            {
                vetorC[i] = vetorB[a];
                a++;
            }
        }

        Console.Write("\nVetor A: ");
        for (int i = 0; i < vetorA.Length; i++)
        {
            Console.Write(vetorA[i] + " ");
        }

        Console.Write("\nVetor B: ");
        for (int i = 0; i < vetorB.Length; i++)
        {
            Console.Write(vetorB[i] + " ");
        }

        Console.Write("\nVetor C: ");
        for (int i = 0; i < vetorC.Length; i++)
        {
            Console.Write(vetorC[i] + " ");
        }
    }
}