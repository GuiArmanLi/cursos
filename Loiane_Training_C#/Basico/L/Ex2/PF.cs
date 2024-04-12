class PF : Contribuinte
{
    private double _valorDosImpostos;
    public double ValorDosImpostos
    {
        get { return _valorDosImpostos; }
        set { _valorDosImpostos = value; }
    }

    public PF(string nome, double rendaBruta)
    {
        base.Nome = nome;
        base.RendaBruta = rendaBruta;
        this.ValorDosImpostos = CalcularImpostos(RendaBruta);
    }
    public override double CalcularImpostos(double rendaBruta)
    {
        if (rendaBruta > 3600)
        {
            return rendaBruta * 0.3;
        }
        else if (rendaBruta > 2800)
        {
            return rendaBruta * 0.25;
        }
        else if (rendaBruta > 2100)
        {
            return rendaBruta * 0.15;
        }
        else if (rendaBruta > 1400)
        {
            return rendaBruta * 0.1;
        }

        return 0;
    }

    public override string ToString()
    {
        return "[" + "Nome: " + base.Nome + ", Renda bruta: " + base.RendaBruta + ", Valor dos impostos: " + this.ValorDosImpostos + "]";

    }

}