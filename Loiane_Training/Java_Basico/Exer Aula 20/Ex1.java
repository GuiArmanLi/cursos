import java.util.Random;

class Ex1 {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] matriz = new int[4][4];

        var maxValue = 0;

        for (int line = 0; line < matriz.length; line++) {
            for (int column = 0; column < matriz.length; column++) {
                matriz[line][column] = random.nextInt(0, 10);
                System.out.print(matriz[line][column] + " ");

                if (matriz[line][column] > maxValue) {
                    maxValue = matriz[line][column];
                }
            }
            System.out.println();
        }

        System.out.println("Maior valor da Matriz: " + maxValue);
    }
}