using System;

class Ex23
{
    static void Main(string[] args)
    {
        Console.WriteLine("Digite um numero");
        int numero = int.Parse(Console.ReadLine());

        int contador = 0;
        bool isPrime = false;
        for (int i = 1; i <= numero; i++)
        {

            string operacoes = "";
            contador = 0;
            isPrime = false;

            if (i == 1)
            {
                isPrime = true;
            }
            else
            {
                for (int j = 1; j <= i; j++)
                {
                    operacoes += " " + j;


                    if (i % j == 0)
                    {
                        contador++;
                    }

                    if (contador == 2 || i == 1)
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
                Console.WriteLine($"{i} e Primo");
            }
            else
            {
                Console.WriteLine($"{i} nao e Primo - Operacoes necessarias para achar primo de {i}: {operacoes}");
            }
        }
    }
}