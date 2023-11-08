public class Square extends Shape2D {
    public Square() {
    }

    public Square(String name, String color) {
        super(name, color);
    }

    @Override
    public double calculateArea(double side) {
        return Math.pow(side, 2);
    }
}