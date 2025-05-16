using System;

class Program
{
    static void Main(string[] args)
    {
        int h = 0;
        do
        {
            Console.WriteLine("Digite a altura do triangulo!");
            h = int.Parse(Console.ReadLine());

            if (h < 1 || h > 9)
            {
                Console.WriteLine("Altura invalida, insira uma altura de 1 a 9");
            }
        } while (h < 1 || h > 9);

        for (int i = 0; i < h; i++)
        {
            for (int j = 0; j <= i; j++)
            {
                Console.Write("*");
            }
            Console.WriteLine();
        }
    }
}