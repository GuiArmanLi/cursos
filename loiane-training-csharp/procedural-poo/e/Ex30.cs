using System;

class Ex30
{
    static void Main(string[] args)
    {
        int[] vetorA = new int[20] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
        int[] vetorB = new int[20];
        int[] vetorC = new int[20];

        int b = 0;
        int c = 0;
        for (int i = 0; i < vetorA.Length; i++)
        {
            if (vetorA[i] % 2 == 0)
            {
                vetorB[b] = vetorA[i];
                b++;
            }
            else
            {
                vetorC[c] = vetorA[i];
                c++;
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