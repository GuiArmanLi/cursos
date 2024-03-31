using System;

class Ex33
{
    static void Main(string[] args)
    {
        Console.Write("Deseja ler quantas temperaturas? ");
        int numeroTotalDeRepeticoes = int.Parse(Console.ReadLine());


        double smallerrTemp = double.MaxValue;
        double greaterTemp = double.MinValue;
        double sum = 0;
        for (int i = 0; i < numeroTotalDeRepeticoes; i++)
        {
            double temp = 0;
            do
            {
                Console.Write("Digite uma temperatura: ", i + 1);
                temp = double.Parse(Console.ReadLine());
            } while (temp < 0 || temp > 1000);

            if (temp > greaterTemp)
                greaterTemp = temp;

            if (temp < smallerrTemp)
                smallerrTemp = temp;

            sum += temp;
        }

        Console.WriteLine("Maior valor: {0}", greaterTemp);
        Console.WriteLine("Menor valor: {0}", smallerrTemp);
        Console.WriteLine("Soma dos valorres: {0}", sum / numeroTotalDeRepeticoes);
    }
}