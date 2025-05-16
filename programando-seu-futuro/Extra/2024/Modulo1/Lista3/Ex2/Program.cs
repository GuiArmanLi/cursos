using System;

class Program
{
    static void Main(string[] args)
    {
        Console.WriteLine("Bem vindo a loja do Jorel!");
        Console.WriteLine("Entre com o nome do produto e, logo após, seu preço.");

        double PrecoTotal = 0;
        bool EstaComprando = true;
        while (EstaComprando)
        {
            Console.Write("Nome do produto:\t");
            string NomeProduto = Console.ReadLine();

            Console.Write("Preço do produto:\t");
            double PrecoProduto = double.Parse(Console.ReadLine());

            PrecoTotal += PrecoProduto;

            Console.WriteLine("Digite [Y] para continuar as compras");
            Console.WriteLine("Digite [N] para encerrar as compras");
            if (Console.ReadLine() == "N") { EstaComprando = false; }
        }
        if (PrecoTotal > 150)
        {
            Console.WriteLine("Parabéns, ganhou frete grátis! Compra total:\tR${0}", PrecoTotal);
        } else {
            Console.WriteLine("Pobre, não ganhou frete grátis! Compra total:\tR${0}", PrecoTotal);
        }
    }
}