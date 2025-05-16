class Player
{
    private static bool PlayerOne = true;
    private static bool PlayerTwo = false;

    public static char getPlayerAtual()
    {
        return PlayerOne ? 'X' : 'O';
    }

    public static void TrocarTurno()
    {
        PlayerOne = !PlayerOne;
        PlayerTwo = !PlayerTwo;
    }
}