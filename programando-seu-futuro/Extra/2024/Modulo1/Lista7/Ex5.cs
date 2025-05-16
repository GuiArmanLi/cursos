using System;

class Ex5
{
    static void Main(string[] args)
    {
        int[,] arena = new int[4, 4];

        PreencherVetor(arena);
        bool existeBalista = VerificarSeHaBalistas(arena);

        string mensagem = "";
        mensagem = existeBalista ? "Fique atento! existem balistas no tabuleiro" : "nao ha balistas no tabuleiro";

        Console.WriteLine(mensagem);
    }

    static void PreencherVetor(int[,] arena)
    {
        for (int i = 0; i < arena.GetLength(0); i++)
        {
            for (int j = 0; j < arena.GetLength(1); j++)
            {
                Console.Write("Digite o valor {0}:{1} da arena: ", i, j);
                int numero = int.Parse(Console.ReadLine());

                arena[i, j] = numero;
                if (numero < 0 || numero > 9)
                {
                    j--;
                }
            }
        }
    }

    static bool VerificarSeHaBalistas(int[,] arena)
    {
        for (int i = 0; i < arena.GetLength(0); i++)
        {
            for (int j = 0; j < arena.GetLength(1); j++)
            {
                if (arena[i, j] == 0)
                {
                    return true;
                }
            }
        }

        return false;
    }
}
