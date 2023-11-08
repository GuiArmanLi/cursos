public class Cylinder extends Shape3D {
    public Cylinder() {
    }

    public Cylinder(String name, String color) {
        super(name, color);
    }

    @Override
    public double calculateVolume(double base, double height) {
        return base * height;
    }
}
