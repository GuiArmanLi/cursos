public class TestHash {
    public static void main(String[] args) {
        Hash hash = new Hash();

        boolean continueGame = true;
        while (continueGame) {
            System.out.println("Seu turno");
            hash.play();
            hash.showBoard();
            hash.checkBoard(continueGame);
        }
    }
}
