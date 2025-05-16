using System;

class Ex24
{
    static void Main(string[] args)
    {
        double[] vetorA = new double[10] { 1, 2, 3, 4, 5, 5, 4, 3, 2, 0 };

        bool palindrometro = true;
        for (int i = 0, j = 9; i < vetorA.GetLength(0) / 2; i++, j--)
        {
            if (!(vetorA[i] == vetorA[j]))
            {
                palindrometro = false;
            }
        }

        Console.WriteLine("\nVetor e um Palindrometro? {0}", palindrometro);
    }
}