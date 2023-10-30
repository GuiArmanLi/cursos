import java.util.Scanner;

public class Board {
    Scanner scan = new Scanner(System.in);

    String[][] board = { { "-", "-", "-" }, { "-", "-", "-" }, { "-", "-", "-", } };
    boolean playerX = true;
    boolean validMove = true;
    boolean endGame = false;
    int x;
    int o;

    public void play() {
        var selectedLine = 0;
        var selectedColumn = 0;
        validMove = true;
        while (this.validMove) {
            System.out.println("Digite a linha");
            selectedLine = scan.nextInt();
            System.out.println("Digite a coluna");
            selectedColumn = scan.nextInt();

            validateMove(--selectedLine, --selectedColumn);
        }
    }

    public void displayBoard() {
        for (int line = 0; line < board.length; line++) {
            for (int column = 0; column < board.length; column++) {
                System.out.print(" | " + board[line][column]);
            }
            System.out.println(" |");
        }
    }

    public boolean checkBoard() {
        if (checkWinDiagonal() || checkWinHorizontal() || checkWinVertical() || checkDraw()) {
            return true;
        }
        return false;
    }

    private void validateMove(int line, int column) {
        if ((line < 0 || line > 2) || (column < 0 || column > 2)) {
            System.out.println("Numero invalido");
            
        } else if (playerX && board[line][column].equals("O")
                || playerX == false && board[line][column].equals("X")) {
            System.out.println("Campo invalido");

        } else {
            if (playerX) {
                board[line][column] = "X";
            } else {
                board[line][column] = "O";
            }
            validMove = !validMove;
            playerX = !playerX;
        }
    }

    private boolean checkWinDiagonal() {
        for (int line = 0; line < board.length; line++) {
            if (checkWinner(line, line)) {
                return true;
            }
        }
        x = 0;
        o = 0;
        for (int line = 2, column = 0; line >= 0; line--, column++) {
            if (checkWinner(line, column)) {
                return true;
            }
        }
        x = 0;
        o = 0;
        return false;
    }

    private boolean checkWinHorizontal() {
        for (int line = 0; line < board.length; line++) {
            for (int column = 0; column < board.length; column++) {
                if (checkWinner(line, column)) {
                    return true;
                }
            }
            x = 0;
            o = 0;
        }
        return false;
    }

    private boolean checkWinVertical() {
        for (int line = 0; line < board.length; line++) {
            for (int column = 0; column < board.length; column++) {
                if (checkWinner(column, line)) {
                    return true;
                }
            }
            x = 0;
            o = 0;
        }
        return false;
    }

    private boolean checkWinner(int line, int column) {
        if (board[line][column].equals("X")) {
            x++;
            if (x == 3) {
                return true;
            }

        } else if (board[line][column].equals("O")) {
            o++;
            if (o == 3) {
                return true;
            }
        }
        return false;
    }

    private boolean checkDraw() {
        for (int line = 0; line < board.length; line++) {
            for (int column = 0; column < board.length; column++) {
                if (board[line][column].equals("-")) {
                    return false;
                }
            }
        }
        return true;
    }
}
