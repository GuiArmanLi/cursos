import java.util.Scanner;

public class Pyramid extends Shape3D {
    public Pyramid() {
    }

    public Pyramid(String name, String color) {
        super(name, color);
    }

    @Override
    public double calculateArea(double edge) {
        Scanner scan = new Scanner(System.in);
        double height = getHeight(scan);

        double base = Math.pow(edge, 2);
        double side = (edge * height * 0.5) * 4;

        return base + side;
    }

    @Override
    public double calculateVolume(double edge) {
        Scanner scan = new Scanner(System.in);
        double heigth = getHeight(scan);
        double base = Math.pow(edge, 2);

        return base * heigth / 3;
    }

    private double getHeight(Scanner scan) {
        System.out.println("Digite a altura da Piramide");
        return scan.nextDouble();
    }
}
