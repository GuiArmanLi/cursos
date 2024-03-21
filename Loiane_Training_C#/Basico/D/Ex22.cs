using System;

class Ex22
{
    static void Main(string[] args)
    {
        Console.Write("Digite um numero: ");
        int numero = int.Parse(Console.ReadLine());
        int contador = 0;
        string arrayString = "";
        for (int i = 1; i <= numero; i++)
        {
            if (numero % i == 0)
            {
                arrayString += (" " + i);
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
            Console.WriteLine($"Numero {numero} e divisivel por{arrayString}");
        }
    }
}