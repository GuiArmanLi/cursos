using System;

class Ex6
{
    static void Main(string[] args)
    {
        char[,] tabuleiro = { { ' ', ' ', ' ' }, { ' ', ' ', ' ' }, { ' ', ' ', ' ' } };

        bool playerOne = true;
        bool continueGame = true;
        string playerVencedor = "";

        Console.WriteLine("Para realizar as jogas basta escolher a coluna e a linha corresponde ao tabuleiro.");

        ImprimirTabuleiro(tabuleiro);

        while (continueGame)
        {
            if (playerOne)
            {
                Console.WriteLine("Jogador X, faca sua jogada");
            }
            else
            {
                Console.WriteLine("Jogador O, faca sua jogada");
            }

            int coluna = (int.Parse(Console.ReadLine())) - 1;
            int linha = (int.Parse(Console.ReadLine())) - 1;

            if (tabuleiro[coluna, linha] == ' ')
            {
                char figura = playerOne ? 'X' : 'O';

                tabuleiro[coluna, linha] = figura;

                bool existeVencedor = VerificaVencedor(tabuleiro);

                if (existeVencedor)
                {
                    playerVencedor = playerOne ? "X" : "O";

                    continueGame = false;
                }
                else if (!existeVencedor && TabuleiroCheio(tabuleiro))
                {


                    continueGame = false;
                }

                Console.Clear();
                ImprimirTabuleiro(tabuleiro);
                playerOne = !playerOne;
            }
            else
            {
                Console.Write("Jogada invalida. Tente novamente!\t");
            }
        }

        Console.WriteLine("Parabens jogador {0}, voce venceu!", playerVencedor);
    }


    static void ImprimirTabuleiro(char[,] tabuleiro)
    {
        for (int coluna = 0; coluna < tabuleiro.GetLength(0); coluna++)
        {
            for (int linha = 0; linha < tabuleiro.GetLength(1); linha++)
            {
                Console.Write(" {0} ", tabuleiro[coluna, linha]);
            }
            Console.WriteLine();
        }
    }

    static bool TabuleiroCheio(char[,] tabuleiro)
    {
        for (int coluna = 0; coluna < tabuleiro.GetLength(0); coluna++)
        {
            for (int linha = 0; linha < tabuleiro.GetLength(1); linha++)
            {
                if (tabuleiro[coluna, linha] == ' ') { return false; }
            }
        }

        return true;
    }

    static bool VerificaVencedor(char[,] tabuleiro)
    {
        bool resultado = false;
        int countFigureX = 0;
        int countFigureO = 0;

        resultado = VerificaHorizontal(tabuleiro, countFigureX, countFigureO);
        if (resultado) { return true; }
        resultado = VerificaVertical(tabuleiro, countFigureX, countFigureO);
        if (resultado) { return true; }

        resultado = VerificaDiagonal(tabuleiro, countFigureX, countFigureO);
        if (resultado) { return true; }
        resultado = VerificaDiagonalInversa(tabuleiro, countFigureX, countFigureO);
        if (resultado) { return true; }

        return resultado;
    }

    static bool VerificaHorizontal(char[,] tabuleiro, int countFigureX, int countFigureO)
    {
        for (int coluna = 0; coluna < tabuleiro.GetLength(0); coluna++)
        {
            if (tabuleiro[coluna, 0] == 'X')
            {
                countFigureX++;
            }
            else if (tabuleiro[coluna, 0] == 'O')
            {
                countFigureO++;
            }
        }

        if (countFigureX == 3 || countFigureO == 3)
        {
            return true;
        }
        else
        {
            countFigureX = 0;
            countFigureO = 0;

            return false;
        }
    }

    static bool VerificaVertical(char[,] tabuleiro, int countFigureX, int countFigureO)
    {
        for (int coluna = 0; coluna < tabuleiro.GetLength(0); coluna++)
        {
            for (int linha = 0; linha < tabuleiro.GetLength(1); linha++)
            {

                if (tabuleiro[linha, coluna] == 'X')
                {
                    countFigureX++;
                }
                else if (tabuleiro[linha, coluna] == 'O')
                {
                    countFigureO++;
                }
            }

            if (countFigureX == 3 || countFigureO == 3)
            {
                return true;
            }

            countFigureX = 0;
            countFigureO = 0;
        }

        return false;
    }

    static bool VerificaDiagonal(char[,] tabuleiro, int countFigureX, int countFigureO)
    {
        for (int coluna = 0; coluna < tabuleiro.GetLength(0); coluna++)
        {
            int linha = coluna;
            if (tabuleiro[coluna, linha] == 'X')
            {
                countFigureX++;
            }
            else if (tabuleiro[coluna, linha] == 'O')
            {
                countFigureO++;
            }
        }

        if (countFigureX == 3 || countFigureO == 3)
        {
            return true;
        }
        else
        {
            countFigureX = 0;
            countFigureO = 0;

            return false;
        }
    }

    static bool VerificaDiagonalInversa(char[,] tabuleiro, int countFigureX, int countFigureO)
    {
        for (int coluna = 0, linha = tabuleiro.GetLength(1) - 1; coluna < tabuleiro.GetLength(0); coluna++, linha--)
        {
            if (tabuleiro[coluna, linha] == 'X')
            {
                countFigureX++;
            }
            else if (tabuleiro[coluna, linha] == 'O')
            {
                countFigureO++;
            }
        }

        if (countFigureX == 3 || countFigureO == 3)
        {
            return true;
        }
        else
        {
            countFigureX = 0;
            countFigureO = 0;

            return false;
        }
    }
}
