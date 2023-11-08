public class Teste {
    public static void main(String[] args) {
        Circle circle = new Circle("Circulo", "Azul");
        Square square = new Square("Quadrado", "Marrom");
        Triangle triangle = new Triangle("Triangulo", "Amarelo");
        Cube cube = new Cube("Cubo", "Colorido");
        Cylinder cylinder = new Cylinder("Cilindro", "Branco");
        Pyramid pyramid = new Pyramid("Piramide", "Dourado");

        GeometricShape[] geometricShapes = { circle, square, triangle, cube, cylinder, pyramid };

        for (GeometricShape geometricShape : geometricShapes) {
            System.out.println("Nome: " + geometricShape.getName() + "\tCor: " + geometricShape.getColor()
                    + "\tInstancia de um " + geometricShape instanceof Object);
        }
    }
}
