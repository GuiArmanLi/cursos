public class Circle extends Shape2D {
    public Circle() {
    }

    public Circle(String name, String color) {
        super(name, color);
    }

    @Override
    public double calculateArea(double radius) {
        return Math.pow(radius, 2) * Math.PI;
    }
}
