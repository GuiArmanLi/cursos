using System;

class Ex21
{
    static void Main(string[] args)
    {
        Console.Write("Digite um numero: ");
        int numero = int.Parse(Console.ReadLine());
        int contador = 0;
        for (int i = 1; i <= numero; i++)
        {
            if (numero % i == 0)
            {
                contador++;
            }
        }
        if (contador == 2 || numero == 1)
        {
            Console.WriteLine("Numero primo!");
        }
        else
        {
            Console.WriteLine("Numero nao primo!");
        }
    }
}