using System;

class Ex33
{
    static void Main(string[] args)
    {
        int[] vetorA = new int[10] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        for (int i = 0; i < vetorA.Length; i++)
        {
            bool isPrime = true;

            //Verifica se e primo
            if (vetorA[i] < 1)
            {
                Console.WriteLine("Primo");
                isPrime = false;
            }
            else
            {
                for (int j = 2; j < vetorA[i]; j++)
                {
                    if (vetorA[i] % j == 0)
                    {
                        isPrime = false;
                    }
                }
            }

            if (isPrime)
            {
                Console.WriteLine(vetorA[i] + ": Primo");
            }
            else
            {
                Console.WriteLine(vetorA[i] + ": Nao primo");
            }
        }
    }
}