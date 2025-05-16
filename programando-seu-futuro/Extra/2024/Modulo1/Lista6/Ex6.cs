using System;
class Ex6
{
    static void Main(string[] args)
    {
        int[,] matriz = new int[4, 4];

        for (int i = 0; i < matriz.GetLength(0); i++)
        {
            for (int j = 0; j < matriz.GetLength(1); j++)
            {
                Console.WriteLine("Digite o valor na posicao {0}:{1}", i, j);
                matriz[i, j] = int.Parse(Console.ReadLine());
            }
        }

        Console.WriteLine("Selecione uma das opcoes abaixo:");
        Console.WriteLine("[1] - Imprimir todos os elementos da matriz");
        Console.WriteLine("[2] - Somar todos os elementos e exibir o resultado");
        Console.WriteLine("[3] - Somar todos os elementos da terceira linha (linha de indice 2) e exibir o resultado");
        Console.WriteLine("[4] - Somar todos os elementos da diagonal principal");
        Console.WriteLine("[5] - Somar todos os elementos de indice par da segunda linha");
        int opcao = int.Parse(Console.ReadLine());

        int soma = 0;
        switch (opcao)
        {
            case 1:
                for (int i = 0; i < matriz.GetLength(0); i++)
                {
                    for (int j = 0; j < matriz.GetLength(1); j++)
                    {
                        Console.Write("| {0} ", matriz[i, j]);
                    }
                    Console.Write("|\n");
                }
                break;

            case 2:
                soma = 0;
                for (int i = 0; i < matriz.GetLength(0); i++)
                {
                    for (int j = 0; j < matriz.GetLength(1); j++)
                    {
                        soma += matriz[i, j];
                    }
                }

                System.Console.WriteLine("Soma: {0}", soma);
                break;

            case 3:
                soma = 0;
                for (int i = 0; i < matriz.GetLength(0); i++)
                {
                    for (int j = 0; j < matriz.GetLength(1); j++)
                    {
                        if (j == 2)
                        {
                            soma += matriz[i, j];
                        }
                    }
                }

                System.Console.WriteLine("Soma da terceira linha: {0}", soma);
                break;

            case 4:
                soma = 0;
                for (int i = 0; i < matriz.GetLength(0); i++)
                {
                    for (int j = 0; j < matriz.GetLength(1); j++)
                    {
                        if (i == j)
                        {
                            soma += matriz[i, j];
                        }
                    }
                }

                System.Console.WriteLine("Soma da diagonal principal: {0}", soma);
                break;

            case 5:
                soma = 0;
                for (int i = 0; i < matriz.GetLength(0); i++)
                {
                    for (int j = 0; j < matriz.GetLength(1); j++)
                    {
                        if (i == 1 && j % 2 == 0)
                        {
                            soma += matriz[i, j];
                        }
                    }
                }

                System.Console.WriteLine("Soma da segunda linha: {0}", soma);
                break;

            default:
                Console.WriteLine("Opcao invalida!");
                break;
        }
    }
}