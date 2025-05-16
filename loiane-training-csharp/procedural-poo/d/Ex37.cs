using System;

class Ex37
{
    static void Main(string[] args)
    {
        double smallest = double.MaxValue;
        string smallestCode = "";

        double tallest = double.MinValue;
        string tallestCode = "";

        double fattest = double.MinValue;
        string fattestCode = "";

        double thinnest = double.MaxValue;
        string thinnestCode = "";

        double sumHeight = 0;
        double sumWeight = 0;

        int contador = 0;
        while (true)
        {
            double height = 0;
            double weight = 0;

            Console.Write("\nDigite o codigo do cliente: ");
            string codigo = Console.ReadLine();

            if (codigo == "0")
            {
                break;
            }

            do
            {
                Console.Write("Digite a altura do cliente em centimetros: ");
                height = double.Parse(Console.ReadLine());
            } while (height < 0 || height > 250);

            do
            {
                Console.Write("Digite o peso do cliente em quilos: ");
                weight = double.Parse(Console.ReadLine());
            } while (weight < 0 || weight > 200);

            if (height > tallest)
            {
                tallest = height;
                tallestCode = codigo;
            }

            if (height < smallest)
            {
                smallest = height;
                smallestCode = codigo;
            }

            if (weight > fattest)
            {
                fattest = weight;
                fattestCode = codigo;
            }

            if (weight < thinnest)
            {
                thinnest = weight;
                thinnestCode = codigo;
            }

            sumWeight += weight;
            sumHeight += height;
            contador++;
        }

        Console.WriteLine("Mais gordo : {0} - Codigo: {1}", fattest, fattestCode);
        Console.WriteLine("Mais magro: {0} - Codigo: {1}", thinnest, thinnestCode);

        Console.WriteLine("Mais alto : {0} - Codigo: {1}", tallest, tallestCode);
        Console.WriteLine("Mais baixo: {0} - Codigo: {1}", smallest, smallestCode);

        Console.WriteLine("Media das alturas: {0}", sumHeight / contador);
        Console.WriteLine("Media dos pesos: {0}", sumWeight / contador);
    }
}