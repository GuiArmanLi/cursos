using System;

class Ex27
{
    static void Main(string[] args)
    {
        double[] vetorA = new double[10] { 6, 20, 10, 4, 7, 5, 4, 8, 2, 2 };
        char[] vetorB = new char[10];

        for (int i = 0; i < vetorA.Length; i++)
        {
            if (vetorA[i] < 7)
            {
                vetorB[i] = 'a';
            }
            else if (vetorA[i] == 7)
            {
                vetorB[i] = 'b';
            }
            else if (vetorA[i] > 7 && vetorA[i] < 10)
            {
                vetorB[i] = 'c';
            }
            else if (vetorA[i] == 10)
            {
                vetorB[i] = 'd';
            }
            else
            {
                vetorB[i] = 'e';
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