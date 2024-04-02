using System;

class Ex26
{
    static void Main(string[] args)
    {
        double[] vetorA = new double[10] { 6, 2, 6, 4, 5, 5, 4, 3, 2, 2 };
        double[] vetorB = new double[10] { 3, 5, 4, 2, 7, 8, 1, 20, 3, 2 };
        double[] vetorC = new double[10];

        for (int i = 0; i < vetorA.Length; i++)
        {
            if (vetorA[i] > vetorB[i])
            {
                vetorC[i] = 1;
            }
            else if (vetorA[i] == vetorB[i])
            {
                vetorC[i] = 0;
            }
            else
            {
                vetorC[i] = -1;
            }
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

        System.Console.WriteLine();

        for (int i = 0; i < vetorA.Length; i++)
        {
            Console.Write(vetorC[i] + " ");
        }
    }
}