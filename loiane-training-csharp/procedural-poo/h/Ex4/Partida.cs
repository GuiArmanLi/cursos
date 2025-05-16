using System;

class Partida
{
    private static char PlayerAtual = ' ';
    private static bool ContinueGame = true;

    public static void IniciarPartida()
    {
        Tabuleiro.InstanciarTabuleiro();

        while (ContinueGame)
        {
            PlayerAtual = Player.getPlayerAtual();
            Console.WriteLine("Jogador {0}, faca sua jogada", PlayerAtual);

            int coluna = (int.Parse(Console.ReadLine())) - 1;
            int linha = (int.Parse(Console.ReadLine())) - 1;

            Tabuleiro.AdicionarFigura(PlayerAtual, coluna, linha);
            Tabuleiro.ImprimirTabuleiro();
            ContinueGame = Tabuleiro.VerificaVencedor();
        }

        Console.WriteLine("\nParabens jogador {0}, voce venceu!", PlayerAtual);
    }

}
