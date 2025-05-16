using System;

class Ex1
{
    static void Main(string[] args)
    {
        Console.Write("Deseja percorrer ate qual casa de Fibonacci? ");
        int index = int.Parse(Console.ReadLine());

        int value = percorrerSequenciaFibonacci(index);
        Console.WriteLine("Na casa {0} da sequencia de Fibonacci tem o valor {1}", index, value);
    }

    static int percorrerSequenciaFibonacci(int index)
    {
        if (index < 2)
        {
            return 1;
        }

        return percorrerSequenciaFibonacci(index - 1) + percorrerSequenciaFibonacci(index - 2);
    }
}