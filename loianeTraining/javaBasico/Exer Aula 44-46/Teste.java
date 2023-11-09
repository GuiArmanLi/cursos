import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Circle circle = new Circle("Circulo", "Azul");
        Square square = new Square("Quadrado", "Marrom");
        Triangle triangle = new Triangle("Triangulo", "Amarelo");
        Cube cube = new Cube("Cubo", "Colorido");
        Cylinder cylinder = new Cylinder("Cilindro", "Branco");
        Pyramid pyramid = new Pyramid("Piramide", "Dourado");

        GeometricShape[] geometricShapes = { circle, square, triangle, cube, cylinder, pyramid };
        for (GeometricShape geometricShape : geometricShapes) {
            System.out.print("Nome: " + geometricShape.getName() + "\tCor: " + geometricShape.getColor() + "\t");

            if (verifyShape2D(geometricShape)) {
                System.out.println("É um formato 2D");
            } else {
                System.out.println("É um formato 3D");
            }

            double area = calculateByShape(geometricShape, scan);

            System.out.println("Area do formato: " + area + "\n");
        }
        scan.close();
    }

    private static boolean verifyShape2D(GeometricShape geometricShape) {
        if (geometricShape instanceof Shape2D) {
            return true;
        }
        return false;
    }

    private static double calculateByShape(GeometricShape geometricShape, Scanner scan) {
        double area = 0;
        if (verifyShape2D(geometricShape)) {
            area = ((Shape2D) geometricShape).calculateArea(scan.nextDouble());
            return area;
        }

        if (geometricShape instanceof Cube) {
            area = ((Shape3D) geometricShape).calculateVolume(scan.nextDouble(), 0);
            return area;
        }

        area = ((Shape3D) geometricShape).calculateVolume(scan.nextDouble(), scan.nextDouble());
        return area;
    }
}
