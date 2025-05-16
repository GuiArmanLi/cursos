using System;

class Ex5
{
    static void Main(string[] args)
    {
        int[] vetor = new int[10];

        for (int i = 0; i < vetor.GetLength(0); i++)
        {
            bool repeat = true;
            while (repeat)
            {
                Console.WriteLine("Digite o valor na posicao {0}", i);
                int numero = int.Parse(Console.ReadLine());
                if (numero > 0 && numero < 50)
                {
                    vetor[i] = numero;
                    repeat = false;
                }
            }
        }

        for (int i = 0; i < vetor.GetLength(0); i++)
        {
            Console.WriteLine("{0}", vetor[i]);
        }
    }
}