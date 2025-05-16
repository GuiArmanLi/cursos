using System;

class Ex16
{
    static void Main(string[] args)
    {
        const int numero = 15;
        double[] vetorA = new double[13] { 1, 22, 3, 4, 51, 15, 7, 8, 94, 15, 112, 12, 14 };

        double SomaMenorQueNumero = 0;

        int contadorIgualAoNumero = 0;

        double SomaMaiorQueNumero = 0;
        int contadorMaiorAoNumero = 0;
        for (int i = 0; i < vetorA.GetLength(0); i++)
        {
            if (vetorA[i] > numero)
            {
                SomaMaiorQueNumero += vetorA[i];
                contadorMaiorAoNumero++;
            }
            else if (vetorA[i] == numero)
            {
                contadorIgualAoNumero++;
            }
            else
            {
                SomaMenorQueNumero += vetorA[i];
            }
        }

        Console.Write("\nVetor A: ");
        for (int i = 0; i < vetorA.GetLength(0); i++)
        {
            Console.Write(vetorA[i] + " ");
        }


        Console.WriteLine("\nQuantidade de numeros menores que {0}:\t{1}", numero, SomaMenorQueNumero);
        Console.WriteLine("Quantidade de numeros iguais a {0}:\t{1}", numero, contadorIgualAoNumero);
        Console.WriteLine("Media valores maiores que {0}:\t\t{1}", numero, SomaMaiorQueNumero / contadorMaiorAoNumero);
    }
}