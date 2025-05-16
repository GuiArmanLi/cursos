using System;

class Ex17
{
    static void Main(string[] args)
    {
        Console.Write("Digite um numero para calcular seu fatorial: ");
        int numero = int.Parse(Console.ReadLine());

        int fatorial = 1;
        for (int i = numero; i > 0; i--)
        {
            fatorial *= i;
        }

        Console.WriteLine(fatorial);
    }
}
