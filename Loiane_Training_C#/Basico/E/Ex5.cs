using System;

class Ex5
{
    static void Main(string[] args)
    {
        double[] vetorA = new double[10] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        double[] vetorB = new double[10];

        for (int i = 0; i < vetorA.GetLength(0); i++)
        {
            vetorB[i] = vetorA[i] * i;
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