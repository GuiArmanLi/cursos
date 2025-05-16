using System;

class Ex4
{
    static void Main(string[] args)
    {
        double somatorio = 0;

        bool repeat = true;
        while (repeat)
        {
            Console.Write("Digite um numero: ");
            double numero = double.Parse(Console.ReadLine());

            if (numero < 0)
            {
                repeat = false;
            }
            else if (numero % 2 == 1)
            {
                somatorio += numero;
            }
        }

        Console.Write("Somatorio dos numeros pares digitador: {0}", somatorio);
    }
}