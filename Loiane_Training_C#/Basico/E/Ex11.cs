using System;

class Ex11
{
    static void Main(string[] args)
    {
        double[] vetorA = new double[10] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        int contadorDePares = 0;
        for (int i = 0; i < vetorA.GetLength(0); i++)
        {
            if (vetorA[i] % 2 == 0)
            {
                contadorDePares++;
            }
        }

        Console.Write("\nVetor A: ");
        for (int i = 0; i < vetorA.GetLength(0); i++)
        {
            Console.Write(vetorA[i] + " ");
        }

        Console.Write("\t\tVetor A tem {0} pares", contadorDePares);
    }
}