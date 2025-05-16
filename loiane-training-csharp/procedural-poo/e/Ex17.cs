using System;

class Ex17
{
    static void Main(string[] args)
    {
        int[] vetorA = new int[10];
        int contador = 0;
        for (int i = 0; i < vetorA.GetLength(0); i++)
        {
            int idade = int.Parse(Console.ReadLine());
            vetorA[i] = idade;

            if (idade > 35)
            {
                contador++;
            }
        }

        Console.WriteLine("Quantidade de pessoas com mais de 35 anos: {0}", contador);
    }
}