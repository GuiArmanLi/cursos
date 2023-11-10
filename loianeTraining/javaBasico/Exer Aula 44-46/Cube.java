public class Cube extends Shape3D {
    public Cube() {
    }

    public Cube(String name, String color) {
        super(name, color);
    }

    @Override
    public double calculateArea(double edge) {
        return 6 * Math.pow(edge, 2);
    }

    @Override
    public double calculateVolume(double edge) {
        return Math.pow(edge, 3);
    }
}
