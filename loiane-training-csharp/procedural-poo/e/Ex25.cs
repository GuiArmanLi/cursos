using System;

class Ex25
{
    static void Main(string[] args)
    {
        double[] vetorA = new double[10] { 1, 2, 3, 4, 5, 5, 4, 3, 2, 0 };
        double[] vetorB = new double[10];

        for (int i = 0; i < vetorA.Length; i++)
        {
            if (vetorA[i] % 2 == 0)
            {
                vetorB[i] = 1;
            }
            else
            {
                vetorB[i] = 0;
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
    }
}