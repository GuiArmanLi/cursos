using System;

class Ex19
{
    static void Main(string[] args)
    {
        Console.Write("Deseja digitar quantos valores? ");
        int quantidade = int.Parse(Console.ReadLine());


        double smallerrValue = double.MaxValue;
        double greaterValue = double.MinValue;
        double sum = 0;
        for (int i = 0; i < quantidade; i++)
        {
            double valor = 0;
            do
            {
                Console.Write($"Digite, entre 0 e 1000, o {i + 1} valor: ");
                valor = double.Parse(Console.ReadLine());
            } while (valor < 0 || valor > 1000);

            if (valor > greaterValue)
                greaterValue = valor;

            if (valor < smallerrValue)
                smallerrValue = valor;

            sum += valor;
        }

        Console.WriteLine($"Maior valor: {greaterValue}");
        Console.WriteLine($"Menor valor: {smallerrValue}");
        Console.WriteLine($"Soma dos valorres: {sum}");
    }
}