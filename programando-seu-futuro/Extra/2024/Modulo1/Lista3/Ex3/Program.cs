using System;

class Program
{
    static void Main(string[] args)
    {
        string username = null;
        string password = null;
        int contador = 0;
        do
        {
            Console.WriteLine("Digite nome de usuário:\t");
            username = Console.ReadLine();

            Console.WriteLine("Digite a senha do usuário:\t");
            password = Console.ReadLine();

            if (username == "admin" && password == "123senha")
            {
                Console.WriteLine("Login realizado com sucesso");
            }
            else
            {
                if (contador == 2)
                {
                    Console.WriteLine("Conta bloqueada!");
                    break;
                }
                else if (username != "admin" && password != "123senha")
                {
                    Console.WriteLine("Usuario e senha incorreto");
                }
                else if (username != "admin")
                {
                    Console.WriteLine("Usuario incorreto");
                }
                else
                {
                    Console.WriteLine("Senha incorreto");
                }
            }
            contador++;
        } while (username != "admin" && password != "123senha");
    }
}