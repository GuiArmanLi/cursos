public class Main {
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado();
        Triangulo triangulo = new Triangulo();

        System.out.println(quadrado.calcularArea(4, 4));
        System.out.println(triangulo.calcularArea(4, 4));
    }
}