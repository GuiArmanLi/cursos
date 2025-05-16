using System;

class Ex31
{
    static void Main(string[] args)
    {
        int[] vetorA = new int[20] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
        int[] vetorB = new int[20];

        int j = 0;
        int k = vetorB.Length - 1;
        for (int i = 0; i < vetorA.Length; i++)
        {
            if (vetorA[i] % 2 == 0)
            {
                vetorB[j] = vetorA[i];
                j++;
            }
            else
            {
                vetorB[k] = vetorA[i];
                k--;
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
    }
}