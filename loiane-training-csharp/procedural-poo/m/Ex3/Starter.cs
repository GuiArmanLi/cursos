using System;

class Starter
{
    static void Main(string[] args)
    {
        FiguraGeometrica[] figuraGeometricas = new FiguraGeometrica[6];

        figuraGeometricas[0] = new Circulo("Anel", "Prata", 2.5);
        figuraGeometricas[1] = new Quadrado("Quadro", "Colorido", 5);
        figuraGeometricas[2] = new Triangulo("Quadro Alternativo", "Preto e Branco", 3, 8);

        figuraGeometricas[3] = new Cubo("Cubo Magico", "Colorido", 4);
        figuraGeometricas[4] = new Cilindro("Copo", "Transparente", 3, 15);
        figuraGeometricas[5] = new Piramide("Piramide do Farao", "Cinza Amarelado", 10, 7);

        for (int i = 0; i < figuraGeometricas.Length; i++)
        {
            Console.WriteLine(figuraGeometricas[i].ToString());
        }
    }
}