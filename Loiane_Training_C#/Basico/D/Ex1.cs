using System;

class Ex1
{
    static void Main(string[] args)
    {
        bool repeat = true;

        while (repeat)
        {
            Console.Write("Digite uma nota entre 0 e 10: ");
            int nota = int.Parse(Console.ReadLine());

            if (nota >= 0 && nota <= 10)
            {
                repeat = false;
                break;
            }
            else
            {
                Console.WriteLine("Valor invalido!");
            }
        }
    }
}