abstract class Contribuinte
{
    public string Nome;
    public double RendaBruta;

    public abstract double CalcularImpostos(double rendaBruta);
}