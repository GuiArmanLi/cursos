using System;

class Circulo : Figura2D, IDimensaoSuperficial
{
    public double Raio;

    public Circulo(string nome, string cor, double raio)
    {
        base.Nome = nome;
        base.Cor = cor;
        this.Raio = raio;
        
        base.Area = CalcularArea();
    }

    public double CalcularArea()
    {
        return Math.PI * Math.Pow(this.Raio, 2);
    }

    public override string ToString()
    {
        return "[ Nome: " + base.Nome + ", Cor: " + base.Cor + ", Raio:  " + this.Raio + ", Area: " + base.Area + " ]";
    }
}