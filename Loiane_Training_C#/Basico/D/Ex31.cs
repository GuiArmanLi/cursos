using System;

class Ex31
{
    static void Main(string[] args)
    {
        while (true)
        {
            Console.WriteLine("\nLojas Tabajara");
            Console.WriteLine("Digite o valor dos produtos. Para encerrar a compra, digite [0]");

            double total = 0;
            double preco = 1;
            for (int i = 0; preco != 0; i++)
            {
                Console.Write("Produtos {0}: ", i + 1);
                preco = double.Parse(Console.ReadLine());
                total += preco;
            }

            Console.WriteLine("Total: {0}", total);

            double pagamento = 0;
            Console.Write("Qual valor de pagamento do cliente? ");
            while (true)
            {
                pagamento = double.Parse(Console.ReadLine());
                if (pagamento > total)
                {
                    break;
                }
                else
                {
                    Console.Write("Pagamento menor que valor da compra! Entre com outro valor novamente: ");
                }
            }

            double troco = Math.Abs(total - pagamento);

            Console.WriteLine("Troco: {0}", troco);
        }
    }
}