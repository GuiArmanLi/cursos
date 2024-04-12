class Quadrado : Figura2D
{
    public double Lado;

    public Quadrado(string nome, string cor, double lado)
    {
        base.Nome = nome;
        base.Cor = cor;
        this.Lado = lado;
        
        base.Area = CalcularArea();
    }

    public double CalcularArea()
    {
        return this.Lado * 4;
    }

    public override string ToString()
    {
        return "[ Nome: " + base.Nome + ", Cor: " + base.Cor + ", Lado:  " + this.Lado + ", Area: " + base.Area + " ]";
    }
}