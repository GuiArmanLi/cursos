using System;

class Ex34
{
    static void Main(string[] args)
    {
        int[] vetorA = new int[10] { 12, 23, 34, 45, 56, 67, 31, 22, 6, 38 };

        for (int i = 0; i < vetorA.Length; i++)
        {
            Console.Write("\n\n{0}: ", vetorA[i]);

            for (int j = 0; j <= vetorA[i]; j++)
            {
                if (j % 2 == 0)
                {
                    Console.Write(j + " ");
                }
            }
        }
    }
}