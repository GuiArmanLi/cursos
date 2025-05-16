using System;

class Ex20
{
    static void Main(string[] args)
    {
        const double cotacao = 5.01;

        double[] vetorA = new double[20] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
        double[] vetorB = new double[20];

        int contadorImpar = 0;
        for (int i = 0; i < vetorA.GetLength(0); i++)
        {
            vetorB[i] = cotacao * vetorA[i];
        }

        Console.Write("\nVetor A: ");
        for (int i = 0; i < vetorA.GetLength(0); i++)
        {
            Console.Write(vetorA[i] + " ");
        }

        Console.Write("\nVetor B: ");
        for (int i = 0; i < vetorB.GetLength(0); i++)
        {
            Console.Write(vetorB[i] + " ");
        }
    }
}