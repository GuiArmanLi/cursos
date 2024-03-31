using System;

class Ex38
{
    static void Main(string[] args)
    {
        const int ANO_ATUAL = 2024;
        double aumento = 1.5;

        Console.Write("Digite o salario inicial do colaborador: ");
        double salarioAtual = double.Parse(Console.ReadLine());
        for (int ano = 1995; ano < ANO_ATUAL; ano++, aumento *= 2)
        {
            Console.WriteLine("Salario do funcionario em {0}: {1}", ano, salarioAtual);
            salarioAtual *= (1 + aumento / 100);
        }
    }
}