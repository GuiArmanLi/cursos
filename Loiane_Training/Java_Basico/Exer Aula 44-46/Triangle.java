import java.util.Scanner;

public class Triangle extends Shape2D {
    public Triangle() {
    }

    public Triangle(String name, String color) {
        super(name, color);
    }

    @Override
    public double calculateArea(double base) {
        Scanner scan = new Scanner(System.in);
        double height = getHeight(scan);

        return base * height / 2;
    }

    private double getHeight(Scanner scan) {
        System.out.println("Digite a altura do Triangulo");
        return scan.nextDouble();
    }
}
