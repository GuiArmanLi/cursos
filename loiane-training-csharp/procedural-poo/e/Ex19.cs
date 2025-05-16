using System;

class Ex19
{
    static void Main(string[] args)
    {
        double[,] notas = new double[2, 10];
        double[] medias = new double[10];

        for (int i = 0; i < notas.GetLength(1); i++)
        {
            double soma = 0;
            for (int j = 0; j < notas.GetLength(0); j++)
            {
                Console.Write("Digite a {0} nota do aluno {1}: ", j + 1, i + 1);
                double nota = double.Parse(Console.ReadLine());

                soma += nota;
            }

            medias[i] = soma / 2;
        }

        for (int i = 0; i < notas.GetLength(1); i++)
        {
            Console.WriteLine("Media do aluno {0}: {1}", i + 1, medias[i]);
        }
    }
}