using System;

class Ex34
{
    static void Main(string[] args)
    {
        Console.WriteLine("Digite um numero");
        int numero = int.Parse(Console.ReadLine());

        bool isPrime = false;

        if (numero == 1)
        {
            isPrime = true;
        }
        else
        {
            int contador = 0;
            for (int i = 1; i <= numero; i++)
            {
                if (numero % i == 0)
                {
                    contador++;
                }

                if (contador == 2)
                {
                    isPrime = true;
                }
                else
                {
                    isPrime = false;
                }
            }
        }


        if (isPrime)
        {
            Console.WriteLine("{0} e Primo", numero);
        }
        else
        {
            Console.WriteLine("{0} nao e Primo", numero);
        }
    }
}
