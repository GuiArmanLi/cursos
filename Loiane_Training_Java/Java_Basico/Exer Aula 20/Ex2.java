import java.util.Random;

public class Ex2 {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] matriz = new int[10][10];

        for (int line = 0; line < matriz.length; line++) {
            for (int column = 0; column < matriz.length; column++) {
                matriz[column][line] = random.nextInt(0, 10);
                System.out.print(matriz[column][line] + "  ");
            }
            System.out.println();
        }

        var maxValueColumn = Integer.MIN_VALUE;
        var minValueColumn = Integer.MAX_VALUE;
        var maxValueLine = Integer.MIN_VALUE;
        var minValueLine = Integer.MAX_VALUE;

        for (int line = 0; line < matriz.length; line++) {
            for (int column = 0; column < matriz.length; column++) {
                if (matriz[line][5] > maxValueLine) {
                    maxValueLine = matriz[column][5];
                }
                if (matriz[line][5] < minValueLine) {
                    minValueLine = matriz[column][5];
                }

                if (matriz[7][column] > maxValueColumn) {
                    maxValueColumn = matriz[7][line];
                }

                if (matriz[7][column] < minValueColumn) {
                    minValueColumn = matriz[7][line];
                }
            }
        }
        System.out.println("Coluna 7 - Maior valor: " + maxValueColumn);
        System.out.println("Coluna 7 - Menor valor: " + minValueColumn);
        System.out.println("Linha 5 - Maior valor: " + maxValueLine);
        System.out.println("Linha 5 - Menor valor: " + minValueLine);
    }
}
