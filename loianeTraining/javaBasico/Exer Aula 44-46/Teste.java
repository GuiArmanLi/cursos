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
            System.out.println("\n\n==============================================");
            System.out.println("Nome: " + geometricShape.getName() + "\t|\tCor: " + geometricShape.getColor());

            boolean isShape2D = verifyShape2D(geometricShape);
            double area, volume;
            if (isShape2D) {
                area = calculateAreaByShape(geometricShape, scan);
                System.out.println("Formato 2D\t|\tArea do formato: " + area);
            } else {
                area = calculateAreaByShape(geometricShape, scan);
                volume = calculateVolumeByShape(geometricShape, scan);
                System.out.println("Formato 3D\t|\tArea do formato: " + area + "\t|\tVolume do formato: " + volume);
            }
        }
        scan.close();
    }

    private static double calculateAreaByShape(GeometricShape geometricShape, Scanner scan) {
        System.out.print("Insira um numero para calcular a area do Formato: ");
        
        double area = 0;
        if (verifyShape2D(geometricShape)) {
            area = ((Shape2D) geometricShape).calculateArea(scan.nextDouble());
            return area;
        }
        area = ((Shape3D) geometricShape).calculateArea(scan.nextDouble());
        return area;
    }
    
    private static double calculateVolumeByShape(GeometricShape geometricShape, Scanner scan) {
        if (verifyShape2D(geometricShape)) {
            return 0;
        }
        
        System.out.print("Insira um numero para calcular o volume do Formato: ");
        return ((Shape3D) geometricShape).calculateVolume(scan.nextDouble());
    }
    
    private static boolean verifyShape2D(GeometricShape geometricShape) {
        if (geometricShape instanceof Shape2D) {
            return true;
        }
        return false;
    }
}
