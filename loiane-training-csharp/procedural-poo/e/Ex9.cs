using System;

class Ex7
{
    static void Main(string[] args)
    {
        double[] vetorA = new double[10] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        double[] vetorB = new double[10] { 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
        double[] vetorC = new double[10];

        for (int i = 0; i < vetorA.GetLength(0); i++)
        {
            vetorC[i] = vetorA[i] / vetorB[i];
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

        Console.Write("\nVetor C: ");
        for (int i = 0; i < vetorA.GetLength(0); i++)
        {
            Console.Write(vetorC[i] + " ");
        }
    }
}