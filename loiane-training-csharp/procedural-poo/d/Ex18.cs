using System;

class Ex18
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
            Console.Write($"Digite o {i + 1} valor: ");
            double valor = double.Parse(Console.ReadLine());

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