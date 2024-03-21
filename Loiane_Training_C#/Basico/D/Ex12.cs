using System;

class Ex12
{
    static void Main(string[] args)
    {
        Console.WriteLine("Digite qual tabuada, entre 1 e 10, deseja ver: ");
        int numeroDaTabuada = int.Parse(Console.ReadLine());

        if (numeroDaTabuada > 0 && numeroDaTabuada < 10)
        {
            for (int i = 1; i <= 10; i++)
            {
                Console.WriteLine($"{numeroDaTabuada} x {i} = {numeroDaTabuada * i}");
            }
        }
        else
        {
            Console.WriteLine("Entrada Invalida!");
        }
    }
}