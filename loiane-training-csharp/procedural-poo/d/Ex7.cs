using System;

class Ex7
{
    static void Main(string[] args)
    {
        int greaterNumber = 0;
        for (int i = 0; i < 5; i++)
        {
            Console.Write("Digite um numero: ");
            int number = int.Parse(Console.ReadLine());

            if (number > greaterNumber)
            {
                greaterNumber = number;
            }
        }

        Console.WriteLine("Maior numero digitado: " + greaterNumber);
    }
}