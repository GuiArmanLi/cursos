class Piramide : Figura3D
{
    public double Base;
    public double Altura;

    public Piramide(string nome, string cor, double @base, double altura)
    {
        base.Nome = nome;
        base.Cor = cor;
        this.Base = @base;
        this.Altura = altura;

        base.Volume = CalcularVolume();
    }

    public double CalcularVolume()
    {
        return 0.33 * this.Base * this.Altura;
    }

    public override string ToString()
    {
        return "[ Nome: " + base.Nome + ", Cor: " + base.Cor + ", Base: " + this.Base + ", Altura: " + this.Altura + ", Area: " + base.Volume + " ]";
    }
}