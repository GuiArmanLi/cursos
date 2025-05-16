using System;

struct Produto
{
    public Guid Id;
    public string Nome;
    public double Preco;

    public bool DisponivelEmEstoque;

    public Produto(string nome, double preco, bool disponivelEmEstoque)
    {
        this.Id = Guid.NewGuid();
        this.Nome = nome;
        this.Preco = preco;
        this.DisponivelEmEstoque = disponivelEmEstoque;
    }

    public override string ToString()
    {
        return "[ " + "Id: " + Id + ", Nome: " + this.Nome + ", Preco: R$" + this.Preco + "Disponivel? " + this.DisponivelEmEstoque + " ]";
    }
}