using System;

class Program
{
    static void Main(string[] args)
    {
        Tabuleiro.InicializaTabuleiro();

        for (int i = 0; i < 8; i++)
        {
            for (int j = 0; j < 8; j++)
            {
                if (i == 0 || j == 0 || i == 7 || j == 7)
                {
                    Tabuleiro.Adicionar(i, j, "X");
                }
            }
        }

        Tabuleiro.ImprimeTabuleiro();
    }
}