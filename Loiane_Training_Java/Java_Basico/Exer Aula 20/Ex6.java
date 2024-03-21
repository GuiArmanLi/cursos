import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[][] hash = { { "-", "-", "-" }, { "-", "-", "-" }, { "-", "-", "-" } };

        var continueGame = true;
        var turn = true;
        var selectedLine = 0;
        var selectedColumn = 0;
        while (continueGame) {
            if (turn) {
                while (turn) {
                    System.out.println("Sua vez de Jogar");
                    System.out.println("Jogador 1, digite a linha desejada");
                    selectedLine = scan.nextInt();

                    System.out.println("Jogador 1, digite a coluna desejada");
                    selectedColumn = scan.nextInt();

                    if (hash[selectedLine - 1][selectedColumn - 1].equals("-")) {
                        hash[selectedLine - 1][selectedColumn - 1] = "X";
                        turn = !turn;
                    } else {
                        System.out.println("\tJogada invalida, tente novamente\n");
                    }
                }
            } else {
                while (turn == false) {
                    System.out.println("Sua vez de Jogar");
                    System.out.println("Jogador 2, digite a linha desejada");
                    selectedLine = scan.nextInt();

                    System.out.println("Jogador 2, digite a coluna desejada");
                    selectedColumn = scan.nextInt();

                    if (hash[selectedLine - 1][selectedColumn - 1].equals("-")) {
                        hash[selectedLine - 1][selectedColumn - 1] = "O";
                        turn = !turn;
                    } else {
                        System.out.println("\tJogada invalida, tente novamente\n");
                    }
                }
            }

            for (int line = 0; line < hash.length; line++) {
                for (int column = 0; column < hash.length; column++) {
                    System.out.print(hash[line][column] + " | ");
                }
                System.out.println();
            }

            var emptyCells = 0;
            for (int line = 0; line < hash.length; line++) {
                for (int column = 0; column < hash.length; column++) {
                    if (hash[line][column].equals("-")) {
                        emptyCells++;
                    }
                }
            }

            var invertedDiagonalX = 0;
            var invertedDiagonalO = 0;
            for (int line = hash.length - 1, cont = 0; line >= 0; line--, cont++) {
                if (hash[cont][line].equals("X")) {
                    invertedDiagonalX++;

                    if (invertedDiagonalX == 3) {
                        scan.close();
                        System.out.println("\n\nJogo acabou, Player 1 venceu");
                        return;
                    }
                } else if (hash[cont][line].equals("O")) {
                    invertedDiagonalO++;

                    if (invertedDiagonalO == 3) {
                        scan.close();
                        System.out.println("\n\nJogo acabou, Player 2 venceu");
                        return;
                    }
                }
            }

            var diagonalX = 0;
            var diagonalO = 0;
            for (int line = 0; line < hash.length; line++) {

                if (hash[line][line].equals("X")) {
                    diagonalX++;

                    if (diagonalX == 3) {
                        scan.close();
                        System.out.println("\n\nJogo acabou, Player 1");
                        return;
                    }

                } else if (hash[line][line].equals("O")) {
                    diagonalO++;

                    if (diagonalO == 3) {
                        scan.close();
                        System.out.println("\n\nJogo acabou, Player 2");
                        return;
                    }
                }

                var horizontalX = 0;
                var horizontalO = 0;
                var verticalX = 0;
                var verticalO = 0;
                for (int column = 0; column < hash.length; column++) {

                    if (hash[column][line].equals("X")) {
                        verticalX++;

                        if (verticalX == 3) {
                            scan.close();
                            System.out.println("\n\nJogo acabou, Player 1");
                            return;
                        }
                    } else if (hash[column][line].equals("O")) {
                        verticalO++;

                        if (verticalO == 3) {
                            scan.close();
                            System.out.println("\n\nJogo acabou, Player 2");
                            return;
                        }
                    }

                    if (hash[line][column].equals("X")) {
                        horizontalX++;

                        if (horizontalX == 3) {
                            scan.close();
                            System.out.println("\n\nJogo acabou, Player 1");
                            return;
                        }
                    } else if (hash[line][column].equals("O")) {
                        horizontalO++;

                        if (horizontalO == 3) {
                            scan.close();
                            System.out.println("\n\nJogo acabou, Player 2");
                            return;
                        }
                    }
                }
            }

            if (emptyCells == 0) {
                System.out.println("Empate");
                continueGame = false;
            }
        }
        scan.close();
        return;
    }
}
