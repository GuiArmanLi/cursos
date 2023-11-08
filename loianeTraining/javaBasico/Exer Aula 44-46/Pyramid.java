public class Pyramid extends Shape3D {
    public Pyramid() {
    }

    public Pyramid(String name, String color) {
        super(name, color);
    }

    @Override
    public double calculateVolume(double base, double heigth) {
        return base * heigth / 3;
    }
}
