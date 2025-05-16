using System;

class Ex4
{
    static void Main(string[] args)
    {
        int[,] matriz = new int[3, 3];

        for (int i = 0; i < matriz.GetLength(0); i++)
        {
            for (int j = 0; j < matriz.GetLength(1); j++)
            {
                Console.WriteLine("Digite o valor na posicao {0}:{1}", i, j);
                matriz[i, j] = int.Parse(Console.ReadLine());

                if (i + j == 2)
                {
                    matriz[i, j] *= 2;
                }
            }
        }
        for (int i = 0; i < matriz.GetLength(0); i++)
        {
            for (int j = 0; j < matriz.GetLength(1); j++)
            {
                Console.Write("| {0} ", matriz[i,j]);
            }
            Console.Write("|\n");
        }
    }
}