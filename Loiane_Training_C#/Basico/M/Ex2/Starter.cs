using System;

class Starter
{
    static void Main(string[] args)
    {
        var circulo = new Circulo("Anel", "Prata", 2.5);
        Console.WriteLine(circulo.ToString());

        var quadrado = new Quadrado("Quadro", "Colorido", 5);
        Console.WriteLine(quadrado.ToString());

        var triangulo = new Triangulo("Quadro Alternativo", "Preto e Branco", 3, 8);
        Console.WriteLine(triangulo.ToString());

        var cubo = new Cubo("Cubo Magico", "Colorido", 4);
        Console.WriteLine(cubo.ToString());

        var cilindro = new Cilindro("Copo", "Transparente", 3, 15);
        Console.WriteLine(cilindro.ToString());

        var Piramide = new Piramide("Piramide do Farao", "Cinza Amarelado", 10, 7);
        Console.WriteLine(Piramide.ToString());
    }
}