using System;

class Ex18
{
    static void Main(string[] args)
    {
        int[] vetorA = new int[10];

        int menorIdade = int.MaxValue;
        int indiceMenorIdade = 0;

        int maiorIdade = int.MinValue;
        int indiceMaiorIdade = 0;
        for (int i = 0; i < vetorA.GetLength(0); i++)
        {
            int idade = int.Parse(Console.ReadLine());
            vetorA[i] = idade;

            if (idade > maiorIdade)
            {
                indiceMaiorIdade = i;
                menorIdade = vetorA[i];
            }
            else if (idade < menorIdade)
            {
                indiceMenorIdade = i;
                maiorIdade = vetorA[i];
            }
        }

        Console.WriteLine("Pessoa mais velha: {0} - Indice: {1}", maiorIdade, indiceMaiorIdade);
        Console.WriteLine("Pessoa mais nova: {0} - Indice: {1}", menorIdade, indiceMenorIdade);
    }
}