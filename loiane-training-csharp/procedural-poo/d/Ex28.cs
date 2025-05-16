using System;

class Ex28
{
    static void Main(string[] args)
    {
        Console.WriteLine("Ola colecionador de CD\'s, voce colecionou quantos CD\'s ate agora? ");
        int quantidadeDaColecao = int.Parse(Console.ReadLine());

        int totalInvestido = 0;
        for (int i = 0; i < quantidadeDaColecao; i++)
        {
            Console.WriteLine("Voce lembra quanto gastou no {0} CD?", i + 1);
            int valorDoCD = int.Parse(Console.ReadLine());

            totalInvestido += valorDoCD;
        }

        double mediaUnitariaDosCDs = totalInvestido / quantidadeDaColecao;

        Console.WriteLine("Total investido: {0}", totalInvestido);
        Console.WriteLine("Media de gasto de cada CD: R${0}", mediaUnitariaDosCDs);
    }
}