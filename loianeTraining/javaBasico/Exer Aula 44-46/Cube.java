public class Cube extends Shape3D {
    public Cube() {
    }

    public Cube(String name, String color) {
        super(name, color);
    }
    @Override
    public double calculateVolume(double side, double nullParam) {
        return Math.pow(side, 3);
    }
}
