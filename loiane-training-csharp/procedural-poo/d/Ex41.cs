using System;

class Ex41
{
    static void Main(string[] args)
    {
        Console.Write("Digite o valor de uma divida: ");
        double valorDivida = double.Parse(Console.ReadLine());

        double parcelas = 1;
        Console.WriteLine("Valor da divida \t Valor dos juros \t Quantidade de parcelas \t Valor da parcela");
        for (int i = 0, juros = 50; i < 5; i++, juros += 50)
        {
            if (i != 0)
            {
                parcelas += i == 1 ? 2 : 3;
            }
            double valorParcela = (valorDivida + juros) / parcelas;

            double totalAPagar = valorDivida + juros;
            Console.WriteLine("R$ {0} \t\t {1} \t\t\t {2} \t\t\t\t R$ {3}", totalAPagar, juros, parcelas, valorParcela);
        }
    }
}
