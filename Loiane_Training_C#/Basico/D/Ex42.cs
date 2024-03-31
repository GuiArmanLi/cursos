using System;

class Ex42
{
    static void Main(string[] args)
    {
        int intervalo0_25 = 0;
        int intervalo26_50 = 0;
        int intervalo51_75 = 0;
        int intervalo76_100 = 0;

        double number = 0;
        do
        {
            Console.Write("Digite um numero entre 0 e 100 ou um numero negativo para parar a leitura: ");
            number = double.Parse(Console.ReadLine());

            if (number > 0 && number <= 25)
            {
                intervalo0_25++;
            }
            else
            if (number > 25 && number <= 50)
            {
                intervalo26_50++;
            }
            if (number > 50 && number <= 75)
            {
                intervalo51_75++;
            }
            if (number > 75 && number <= 100)
            {
                intervalo76_100++;
            }
        } while (number > 0);

        Console.WriteLine("Numero entre 0 e 25 : {0}", intervalo0_25);
        Console.WriteLine("Numero entre 25 e 50 : {0}", intervalo26_50);
        Console.WriteLine("Numero entre 50 e 75 : {0}", intervalo51_75);
        Console.WriteLine("Numero entre 75 e 100 : {0}", intervalo76_100);
    }
}