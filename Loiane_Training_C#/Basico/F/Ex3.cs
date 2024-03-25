using System;

class Ex3
{
    static void Main(string[] args)
    {
        int quantidadeDePares = 0;
        int quantidadeDeImpares = 0;

        int[,] matriz = new int[3, 3];

        for (int i = 0; i < matriz.GetLength(0); i++)
        {
            for (int j = 0; j < matriz.GetLength(1); j++)
            {
                Console.WriteLine("Digite o valor que deseja fica na posicao [{0} {1}]", i, j);
                int numero = int.Parse(Console.ReadLine());

                if (numero % 2 == 0)
                {
                    quantidadeDePares++;
                }
                else
                {
                    quantidadeDeImpares++;
                }
                matriz[i, j] = numero;
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

        Console.WriteLine("Quantidade de Pares {0} | Quantidade de Impares {1}", quantidadeDePares, quantidadeDeImpares);
    }
}