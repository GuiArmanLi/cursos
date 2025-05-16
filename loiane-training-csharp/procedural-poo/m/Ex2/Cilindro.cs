using System;

class Cilindro : Figura3D
{
    public double Raio;
    public double Altura;

    public Cilindro(string nome, string cor, double raio, double altura)
    {
        base.Nome = nome;
        base.Cor = cor;
        this.Raio = raio;
        this.Altura = altura;

        base.Volume = CalcularVolume();
    }

    public double CalcularVolume()
    {
        var volume = Math.PI * Math.Pow(this.Raio, 2) * this.Altura;
        return Math.Round(volume, 2);
    }

    public override string ToString()
    {
        return "[ Nome: " + base.Nome + ", Cor: " + base.Cor + ", Raio: " + this.Raio + ", Altura: " + this.Altura + ", Volume: " + base.Volume + " ]";
    }
}