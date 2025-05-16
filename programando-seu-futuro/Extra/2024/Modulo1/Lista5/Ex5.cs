class Ex5
{
    static void Main(string[] args)
    {
        Tabuleiro.InicializaTabuleiro();

        for (int i = 0; i < 8; i++)
        {
            for (int j = 0; j < 8; j++)
            {
                if (i % 2 == 0)
                {
                    Tabuleiro.Adicionar(i, j, "C");
                }
            }
        }

        Tabuleiro.ImprimeTabuleiro();
    }
}