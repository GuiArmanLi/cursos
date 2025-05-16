using System;

class Ex2
{
    static void Main(string[] args)
    {
        int[,] matriz = new int[10, 10];

        Random random = new Random();
        int maiorValorLinha5 = int.MinValue;
        int menorValorLinha5 = int.MaxValue;
        int maiorValorLinha7 = int.MinValue;
        int menorValorLinha7 = int.MaxValue;
        for (int i = 0; i < matriz.GetLength(0); i++)
        {
            for (int j = 0; j < matriz.GetLength(1); j++)
            {
                matriz[i, j] = random.Next(0, 9);

                if (i == 5 && maiorValorLinha5 < matriz[i, j])
                {
                    maiorValorLinha5 = matriz[i, j];
                }

                if (i == 5 && menorValorLinha5 > matriz[i, j])
                {
                    menorValorLinha5 = matriz[i, j];
                }

                if (i == 7 && maiorValorLinha7 < matriz[i, j])
                {
                    maiorValorLinha7 = matriz[i, j];
                }

                if (i == 7 && menorValorLinha7 > matriz[i, j])
                {
                    menorValorLinha7 = matriz[i, j];
                }
            }
        }

        for (int i = 0; i < matriz.GetLength(0); i++)
        {
            for (int j = 0; j < matriz.GetLength(1); j++)
            {
                Console.Write(matriz[i, j] + " ");
            }
            Console.WriteLine();
        }

        Console.WriteLine("Linha 5 - Menor valor: {0} | Maior valor: {1}", menorValorLinha5, maiorValorLinha5);
        Console.WriteLine("Linha 7 - Menor valor: {0} | Maior valor: {1}", menorValorLinha7, maiorValorLinha7);
    }
}