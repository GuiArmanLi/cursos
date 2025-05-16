using System;

class Ex15
{
    static void Main(string[] args)
    {
        double[] vetorA = new double[13] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 14 };

        int contadorImpar = 0;
        for (int i = 0; i < vetorA.GetLength(0); i++)
        {
            if (vetorA[i] % 2 == 1)
            {
                contadorImpar++;
            }
        }

        Console.Write("\nVetor A: ");
        for (int i = 0; i < vetorA.GetLength(0); i++)
        {
            Console.Write(vetorA[i] + " ");
        }

        double porcentagemDeImpares = contadorImpar * 100 / vetorA.GetLength(0);

        System.Console.WriteLine("\ntamanho: " + vetorA.GetLength(0));
        System.Console.WriteLine("quantidade impares: " + contadorImpar);

        Console.WriteLine("\nPorcentagem de valores pares no Vetor A: {0}%", 100 - porcentagemDeImpares);
        Console.WriteLine("Porcentagem de valores impares no Vetor A: {0}%", porcentagemDeImpares);
    }
}