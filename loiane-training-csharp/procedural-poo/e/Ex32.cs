using System;

class Ex32
{
    static void Main(string[] args)
    {
        int[] vetorA = new int[5] { 1, 3, 5, 7, 9 };

        for (int i = 0; i < vetorA.Length; i++)
        {
            for (int j = 1; j <= 10; j++)
            {
                Console.WriteLine("{0} X {1} = {2}", j, vetorA[i], vetorA[i] * j);
            }
            Console.WriteLine();
        }
    }
}
