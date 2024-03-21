using System;

class Ex20
{
    static void Main(string[] args)
    {
        Console.Write("Digite um numero, entre 1 e 16, para calcular seu fatorial: ");

        bool repeat = true;
        while (repeat)
        {
            int number = int.Parse(Console.ReadLine());

            if (number >= 1 && number <= 16)
            {
                int fatorial = 1;
                for (int i = number; i > 0; i--)
                {
                    fatorial *= i;
                }
                Console.WriteLine(fatorial);

                Console.WriteLine("Deseja calcular o fatorial de novo? [1] Sim [2] Nao");
                int request = int.Parse(Console.ReadLine());

                repeat = request == 1;
            }
            else
            {
                Console.WriteLine("Por favor, digite um numero entre 1 e 16.");
            }
        }
    }
}
