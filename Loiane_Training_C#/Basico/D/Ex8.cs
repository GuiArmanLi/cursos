using System;

class Ex8
{
    static void Main(string[] args)
    {
        int QUANTIDADE_DE_NUMEROS = 5;
        int sum = 0;
        for (int i = 0; i < QUANTIDADE_DE_NUMEROS; i++)
        {
            Console.Write("Digite um numero: ");
            int number = int.Parse(Console.ReadLine());

            sum += number;
        }

        Console.WriteLine("Soma: " + sum);
        Console.WriteLine("Media: " + (sum / QUANTIDADE_DE_NUMEROS));
    }
}