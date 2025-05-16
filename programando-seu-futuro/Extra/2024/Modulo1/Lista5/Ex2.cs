using System;

class Ex2
{
    static void Main(string[] args)
    {
        for (int i = 0; i <= 10; i++)
        {
            for (int j = 0; j <= 10; j++)
            {

                Console.WriteLine("{0} X {1} = {2}", i, j, i * j);
            }
            Console.WriteLine();
        }
    }
}