using System.ComponentModel.Design.Serialization;

Console.WriteLine("Digite seu nome de usuario: ");
string username = Console.ReadLine();

Console.WriteLine("Digite seu nome de usuario: ");
string senha = Console.ReadLine();

if (username == "admin" && senha == "123senha")
{
    Console.WriteLine("Login realizado com sucesso!");
}
else
{
    Console.WriteLine("Credenciais invalidas!");
}
