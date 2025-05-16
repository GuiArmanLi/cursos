class PJ : Contribuinte
{

    private double _valorDosImpostos;
    public double ValorDosImpostos
    {
        get { return _valorDosImpostos; }
        set { _valorDosImpostos = value; }
    }

    public PJ(string nome, double rendaBruta)
    {
        base.Nome = nome;
        base.RendaBruta = rendaBruta;
        ValorDosImpostos = CalcularImpostos(base.RendaBruta);
    }

    public override double CalcularImpostos(double rendaBruta)
    {
        return rendaBruta * 0.1;
    }

    public override string ToString()
    {
        return "[" + "Nome: " + base.Nome + ", Renda bruta: " + base.RendaBruta + ", Valor dos impostos: " + this.ValorDosImpostos + "]";

    }
}