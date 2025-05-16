class Triangulo : Figura2D
{
    public double Base;
    public double Altura;

    public Triangulo(string nome, string cor, double @base, double altura)
    {
        base.Nome = nome;
        base.Cor = cor;
        this.Base = @base;
        this.Altura = altura;

        base.Area = CalcularArea();
    }

    public double CalcularArea()
    {
        return 0.5 * this.Base * this.Altura;
    }

    public override string ToString()
    {
        return "[ Nome: " + base.Nome + ", Cor: " + base.Cor + ", Base: " + this.Base + ", Altura: " + this.Altura + ", Area: " + base.Area + " ]";
    }
}