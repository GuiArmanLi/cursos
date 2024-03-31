using System;

class Ex39
{
    static void Main(string[] args)
    {
        double tallest = double.MinValue;
        double smallest = double.MaxValue;
        int tallestNumber = 0;
        int smallestNumber = 0;

        for (int i = 0; i < 3; i++)
        {
            Console.Write("\nDigite o codigo do cliente: ");
            int numeroDoAluno = int.Parse(Console.ReadLine());

            double height = 0;
            do
            {
                Console.Write("Digite a altura do cliente em centimetros: ");
                height = double.Parse(Console.ReadLine());
            } while (height < 0 || height > 250);


            if (height > tallest)
            {
                tallest = height;
                tallestNumber = numeroDoAluno;
            }

            if (height < smallest)
            {
                smallest = height;
                smallestNumber = numeroDoAluno;
            }
        }

        Console.WriteLine("Mais alto : {0} - Codigo: {1}", tallest, tallestNumber);
        Console.WriteLine("Mais baixo: {0} - Codigo: {1}", smallest, smallestNumber);
    }
}