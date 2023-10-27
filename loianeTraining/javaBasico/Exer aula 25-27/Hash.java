import java.util.Scanner;

public class Hash {
    Scanner scan = new Scanner(System.in);

    String[][] board = new String[3][3];
    boolean playerX = true;
    boolean validMove = false;

    public void play() {
        var selectedLine = 0;
        var selectedColumn = 0;
        while (!this.validMove) {
            System.out.println("Digite a linha");
            selectedLine = scan.nextInt();
            System.out.println("Digite a coluna");
            selectedColumn = scan.nextInt();

            validateMove(selectedLine--, selectedColumn--);
        }
    }

    public void showBoard() {
        for (int line = 0; line < board.length; line++) {
            System.out.print(" | ");
            for (int column = 0; column < board.length; column++) {
                System.out.print(" | " + board[line][column]);
            }
            System.out.println();
        }
    }

    public void checkBoard(boolean continueGame) {
        checkBoardDiagonal(continueGame);
        checkBoardHorizAndVert(continueGame);
    }

    private void validateMove(int line, int column) {
        if ((line < 0 || line > 2) || (column < 0 || line > 2)) {
            System.out.println("Numero invalido");
        } else if (board[line][column].equals("-")) {
            System.out.println("Campo invalido");
        } else {
            if (this.playerX) {
                board[line][column] = "X";
            } else {
                board[line][column] = "O";
            }
            this.validMove = !validMove;
        }
    }

    private boolean checkBoardDiagonal(boolean continueGame) {
        for (int position = 0; position < board.length; position++) {
            if (detectedWinner(position)) {
                return !continueGame;
            }
        }

        for (int position = 2; position >= 0; position--) {
            if (detectedWinner(position)) {
                return !continueGame;
            }
        }
        return continueGame;
    }

    private boolean checkBoardHorizAndVert(boolean continueGame) {
        for (int line = 0; line < board.length; line++) {
            for (int column = 0; column < board.length; column++) {
                if (detectedWinner(line, column)) {
                    return !continueGame;
                }
            }
        }
        return continueGame;
    }

    private boolean detectedWinner(int position) {
        var playsMadeX = 0;
        var playsMadeO = 0;
        if (board[position][position].equals("X")) {
            playsMadeX++;

            if (playsMadeX == 3) {
                return true;
            }
        } else if (board[position][position].equals("O")) {
            playsMadeO++;

            if (playsMadeO == 3) {
                return true;
            }
        }
        return false;
    }

    private boolean detectedWinner(int line, int column) {
        var playsMadeX = 0;
        var playsMadeO = 0;
        if (board[line][column].equals("X")) {
            playsMadeX++;

            if (playsMadeX == 3) {
                return true;
            }
        } else if (board[line][column].equals("O")) {
            playsMadeO++;

            if (playsMadeO == 3) {
                return true;
            }
        }
        return false;
    }
}
