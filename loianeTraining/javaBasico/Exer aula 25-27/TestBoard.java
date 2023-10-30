public class TestBoard {
    public static void main(String[] args) {
        Board board = new Board();

        boolean continueGame = true;

        System.out.println("Entre com 1 - 3");
        while (continueGame) {
            System.out.println("Seu turno");
            board.play();
            board.displayBoard();
            continueGame = !board.checkBoard();
        }
    }
}
