using System;

class Tabuleiro
{
    private static char[,] Campo = new char[3, 3];

    public static void InstanciarTabuleiro()
    {
        for (int coluna = 0; coluna < Campo.GetLength(0); coluna++)
        {
            for (int linha = 0; linha < Campo.GetLength(1); linha++)
            {
                Campo[coluna, linha] = ' ';
            }
        }
    }


    public static void ImprimirTabuleiro()
    {
        Console.Clear();

        for (int coluna = 0; coluna < Campo.GetLength(0); coluna++)
        {
            for (int linha = 0; linha < Campo.GetLength(1); linha++)
            {
                Console.Write(" {0} ", Campo[coluna, linha]);
            }
            Console.WriteLine();
        }
    }

    public static void AdicionarFigura(char playerAtual, int coluna, int linha)
    {
        if (Campo[coluna, linha] == ' ')
        {
            Campo[coluna, linha] = playerAtual;
            Player.TrocarTurno();
        }
    }

    private static bool VerificarSeTabuleiroCheio()
    {
        for (int coluna = 0; coluna < Campo.GetLength(0); coluna++)
        {
            for (int linha = 0; linha < Campo.GetLength(1); linha++)
            {
                if (Campo[coluna, linha] == ' ')
                {
                    return false;
                }
            }
        }

        return true;
    }

    public static bool VerificaVencedor()
    {
        if (VerificaDirecoes())
        {
            return false;
        }

        return !VerificarSeTabuleiroCheio();
    }

    private static bool VerificaDirecoes()
    {
        if (VerificaHorizontal() ||
            VerificaVertical() ||
            VerificaDiagonal() ||
            VerificaDiagonalInversa())
        {
            return true;
        }

        return false;
    }


    private static bool VerificaHorizontal()
    {
        int countX = 0, countO = 0;

        for (int coluna = 0; coluna < Campo.GetLength(0); coluna++)
        {
            for (int linha = 0; linha < Campo.GetLength(1); linha++)
            {
                if (Campo[coluna, linha] == 'X')
                {
                    countX++;
                }
                else if (Campo[coluna, linha] == 'O')
                {
                    countO++;
                }


                if (countX == 3 || countO == 3) { return true; }
            }
            countX = 0;
            countO = 0;
        }

        return false;
    }

    private static bool VerificaVertical()
    {
        int countX = 0, countO = 0;

        for (int coluna = 0; coluna < Campo.GetLength(0); coluna++)
        {
            for (int linha = 0; linha < Campo.GetLength(1); linha++)
            {
                if (Campo[linha, coluna] == 'X')
                {
                    countX++;
                }
                else if (Campo[linha, coluna] == 'O')
                {
                    countO++;
                }

                if (countX == 3 || countO == 3) { return true; }
            }
            countX = 0;
            countO = 0;
        }

        return false;
    }

    private static bool VerificaDiagonal()
    {
        int countX = 0, countO = 0;

        for (int coluna = 0; coluna < Campo.GetLength(0); coluna++)
        {
            int linha = coluna;
            if (Campo[coluna, linha] == 'X')
            {
                countX++;
            }
            else if (Campo[coluna, linha] == 'O')
            {
                countO++;
            }
        }


        return countX == 3 || countO == 3 ? true : false;
    }

    private static bool VerificaDiagonalInversa()
    {
        int countX = 0, countO = 0;

        for (int coluna = 0, linha = Campo.GetLength(1) - 1; coluna < Campo.GetLength(0); coluna++, linha--)
        {
            if (Campo[coluna, linha] == 'X')
            {
                countX++;
            }
            else if (Campo[coluna, linha] == 'O')
            {
                countO++;
            }
        }

        return countX == 3 || countO == 3 ? true : false;
    }
}