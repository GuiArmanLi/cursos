using System;

class Ex14
{
    static void Main(string[] args)
    {
        double[] vetorA = new double[10] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        double soma = 0;
        int contadorImpar = 0;
        for (int i = 0; i < vetorA.GetLength(0); i++)
        {
            if (vetorA[i] % 2 == 1)
            {
                soma += vetorA[i];
                contadorImpar++;
            }
        }

        Console.Write("\nVetor A: ");
        for (int i = 0; i < vetorA.GetLength(0); i++)
        {
            Console.Write(vetorA[i] + " ");
        }

        Console.Write("\t\tSoma do Vetor A: {0}", soma / contadorImpar);
    }
}