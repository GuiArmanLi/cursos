import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] board = new char[3][3];
        setBoard(board);

        var isPlayerX = true;
        var continueGame = true;
        while (continueGame) {
            var coordinates = getCoordinates(scanner);
            printPlay(board, coordinates, isPlayerX);
            isPlayerX = !isPlayerX;

            var isThereWinner = verifyWinner(board);
            if (isThereWinner) {
                continueGame = !continueGame;
            } else if (hasNotSpace(board)) {
                System.out.println("Empate");
                continueGame = !continueGame;
            }
            printBoard(board);
        }
    }

    private static boolean hasNotSpace(char[][] board) {
        for (char[] lin : board) {
            for (char col : lin) {
                if (col == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

    public static char[] getCoordinates(Scanner scan) {
        System.out.println("Entre com as coordenadas de 1 - 3");
        String coordinates;
        coordinates = scan.next() + scan.next();

        return coordinates.toCharArray();
    }

    public static void printPlay(char[][] board, char[] coordinates, boolean isPlayerX) {
        try {
            printPlayLogic(board, coordinates, isPlayerX);
        } catch (IndexOutOfBoundsException error) {
            System.out.println(error.getMessage());
        }
    }

    private static void printPlayLogic(char[][] board, char[] coordinates, boolean isPlayerX)
            throws IndexOutOfBoundsException {
        var stringLin = String.valueOf(coordinates[0]);
        var lin = Integer.parseInt(stringLin) - 1;

        var stringCol = String.valueOf(coordinates[1]);
        var col = Integer.parseInt(stringCol) - 1;

        if (board[lin][col] == ' ') {
            char charPlayer = getChar(isPlayerX);
            board[lin][col] = charPlayer;
        } else if (board[lin][col] == 'X' || board[lin][col] == 'O') {
            System.out.println("Jogada Invalida");
        }

        if (lin > 2 || col > 2) {
            throw new IndexOutOfBoundsException();
        }
    }

    private static char getChar(boolean isPlayerX) {
        return isPlayerX ? 'X' : 'O';
    }

    public static boolean verifyWinner(char[][] board) {
        if (verifyWinnerHorizontal(board) ||
                verifyWinnerVertical(board) ||
                verifyWinnerDiagonal(board) ||
                verifyWinnerDiagonalInverted(board)) {
            return true;
        }
        return false;
    }

    private static boolean verifyWinnerHorizontal(char[][] board) {
        for (int lin = 0; lin < board.length; lin++) {
            var scoreX = 0;
            var scoreO = 0;

            for (int col = 0; col < board.length; col++) {
                if (board[lin][col] == 'X') {
                    scoreX++;
                } else if (board[lin][col] == 'O') {
                    scoreO++;
                }
            }
            if (scoreX == 3 || scoreO == 3) {
                return true;
            }
        }
        return false;
    }

    private static boolean verifyWinnerVertical(char[][] board) {
        for (int lin = 0; lin < board.length; lin++) {
            var scoreX = 0;
            var scoreO = 0;

            for (int col = 0; col < board.length; col++) {
                if (board[col][lin] == 'X') {
                    scoreX++;
                } else if (board[col][lin] == 'O') {
                    scoreO++;
                }
            }
            if (scoreX == 3 || scoreO == 3) {
                return true;
            }
        }
        return false;
    }

    private static boolean verifyWinnerDiagonal(char[][] board) {
        var scoreX = 0;
        var scoreO = 0;
        for (int pos = 0; pos < board.length; pos++) {
            if (board[pos][pos] == 'X') {
                scoreX++;
            } else if (board[pos][pos] == 'O') {
                scoreO++;
            }
        }
        return scoreX == 3 || scoreO == 3 ? true : false;
    }

    private static boolean verifyWinnerDiagonalInverted(char[][] board) {
        var scoreX = 0;
        var scoreO = 0;
        for (int lin = board.length - 1, col = 0; lin >= 0; lin--, col++) {
            if (board[lin][col] == 'X') {
                scoreX++;
            } else if (board[lin][col] == 'O') {
                scoreO++;
            }
        }
        return scoreX == 3 || scoreO == 3 ? true : false;
    }

    public static void setBoard(char[][] board) {
        for (int lin = 0; lin < board.length; lin++) {
            for (int col = 0; col < board.length; col++) {
                board[lin][col] = ' ';
            }
        }
    }

    public static void printBoard(char[][] board) {
        for (int lin = 0; lin < 3; lin++) {
            for (int col = 0; col < 3; col++) {
                if (col < 2) {
                    System.out.printf("  %c |", board[lin][col]);
                } else {
                    System.out.printf("  %c  ", board[lin][col]);
                }
            }
            if (lin < 2) {
                System.out.printf("\n----+----+----");
            }
            System.out.println();
        }
    }
}