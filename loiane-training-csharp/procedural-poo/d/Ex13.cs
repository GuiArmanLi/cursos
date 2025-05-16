using System;

class Ex13
{
    static void Main(string[] args)
    {
        Console.WriteLine("Digite a base e o expoente");
        double _base = double.Parse(Console.ReadLine());
        double expoente = double.Parse(Console.ReadLine());

        double sum = 1;
        for (int i = 0; i < expoente; i++)
        {
            sum *= _base;
        }
        Console.WriteLine("Resultado: " + sum);
    }
}