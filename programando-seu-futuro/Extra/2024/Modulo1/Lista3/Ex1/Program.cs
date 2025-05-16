using System;

class Program
{
    static void Main(string[] args)
    {
        const int NUMERO_HABITANTES = 3; //Vai ler so 3 vezes, caso queira 20, apenas mude o valor

        double SomatoriaSalarial = 0;
        int SomatoriaFilhos = 0;
        double MaiorSalario = double.MinValue;
        for (int i = 0; i < NUMERO_HABITANTES; i++)
        {
            Console.Write("Digite o salário do " + (i + 1) + " habitante:\t");
            double Salario = double.Parse(Console.ReadLine());

            Console.Write("Digite o número de filhos do " + (i + 1) + " habitante:\t");
            int QuantFilhos = int.Parse(Console.ReadLine());

            SomatoriaSalarial += Salario;
            SomatoriaFilhos += QuantFilhos;

            if (Salario > MaiorSalario)
            {
                MaiorSalario = Salario;
            }
        }
        double MediaSalarial = SomatoriaSalarial / NUMERO_HABITANTES;
        int MediaFilhos = SomatoriaFilhos / NUMERO_HABITANTES;

        Console.WriteLine("Média salárial da população:\t{0}", MediaSalarial);
        Console.WriteLine("Média de filhos da população:\t{0}", MediaFilhos);
        Console.WriteLine("Maior salário da população:\t{0}", MaiorSalario);
    }
}