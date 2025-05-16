using System;

class Ex2
{
    static void Main(string[] args)
    {
        bool repeat = true;
        while (repeat)
        {
            Console.Write("Digite o nome do usuario:");
            string username = Console.ReadLine();

            Console.Write("Digite a senha do usuario:");
            string password = Console.ReadLine();
            if (username != password)
            {
                repeat = false;
            }
            else
            {
                Console.WriteLine("Erro! Usuario e senha sao iguais!");
            }
        }
    }
}