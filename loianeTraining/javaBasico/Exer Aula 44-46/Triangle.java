public class Triangle extends Shape2D {
    public Triangle() {
    }

    public Triangle(String name, String color) {
        super(name, color);
    }

    @Override
    public double calculateArea(double side) {
        return (Math.pow(side, 2) * Math.sqrt(3)) / 4;
    }
}
