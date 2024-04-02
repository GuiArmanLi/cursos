using System;

//EXERCICIO 21 NAO EXISTE
class Ex22
{
    static void Main(string[] args)
    {
        double[] vetorA = new double[10];

        Random random = new Random();
        Console.Write("\nVetor A: ");

        int contadorDeZeros = 0;
        for (int i = 0; i < vetorA.GetLength(0); i++)
        {
            vetorA[i] = random.Next(0, 2);
            if (vetorA[i] == 0)
            {
                contadorDeZeros++;
            }

            Console.Write(" " + vetorA[i]);
        }

        int porcentagemDeZeros = contadorDeZeros * 100 / vetorA.Length;

        Console.WriteLine("\nNa lista existe:\t {0}% de 0 \t\t{1}% de 1", porcentagemDeZeros, 100 - porcentagemDeZeros);

    }
}