class Cubo : Figura3D
{
    public double Lado;

    public Cubo(string nome, string cor, double lado)
    {
        base.Nome = nome;
        base.Cor = cor;
        this.Lado = lado;

        base.Volume = CalcularVolume();
    }

    public double CalcularVolume()
    {
        return this.Lado * 4;
    }

    public override string ToString()
    {
        return "[ Nome: " + base.Nome + ", Cor: " + base.Cor + ", Lado: " + this.Lado + ", Volume: " + base.Volume + " ]";
    }
}
