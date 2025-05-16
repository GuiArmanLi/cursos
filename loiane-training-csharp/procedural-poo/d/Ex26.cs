using System;

class Ex26
{
    static void Main(string[] args)
    {
        int votosGreg = 0;
        int votosChris = 0;
        int votosCaruso = 0;

        Console.WriteLine("Digite quantas pessoas tem para votar");
        int votos = int.Parse(Console.ReadLine());

        Console.WriteLine("Opcoes de votos: [1] - Greg | [2] - Chris | [3] - Caruso");
        for (int i = 0; i < votos; i++)
        {
            Console.Write("Digite para qual candidato o voto sera destinado: ");
            int voto = int.Parse(Console.ReadLine());

            if (voto == 1)
            {
                votosGreg++;
            }
            else if (voto == 2)
            {
                votosChris++;
            }
            else
            {
                votosCaruso++;

            }
        }
        Console.WriteLine($"Greg tem {votosGreg} votos, Chris tem {votosChris} votos, Caruso tem {votosCaruso} votos.");
    }
}