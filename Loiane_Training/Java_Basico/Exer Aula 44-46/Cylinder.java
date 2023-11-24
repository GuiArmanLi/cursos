import java.util.Scanner;

public class Cylinder extends Shape3D {
    public Cylinder() {
    }

    public Cylinder(String name, String color) {
        super(name, color);
    }

    @Override
    public double calculateArea(double radius) {
        Scanner scan = new Scanner(System.in);
        double height = getHeight(scan);

        double side = 2 * Math.PI * radius * height;
        double base = Math.pow(radius, 2) * Math.PI;
        return side + base * 2;
    }

    @Override
    public double calculateVolume(double radius) {
        Scanner scan = new Scanner(System.in);
        double height = getHeight(scan);
        return Math.PI * Math.pow(radius, 2) * height;
    }

    private double getHeight(Scanner scan) {
        System.out.println("Digite a altura do Cilindro");
        return scan.nextDouble();
    }
}
