using System;

struct Pizza
{
    public Guid Id;
    public string Sabor;
    public double Preco;

    public Pizza(string sabor, double preco)
    {
        this.Id = Guid.NewGuid();
        this.Sabor = sabor;
        this.Preco = preco;
    }

    public override string ToString()
    {
        return "[ " + "Id: " + Id + ", Sabor: " + this.Sabor + ", Preco: R$" + this.Preco + " ]";
    }
}