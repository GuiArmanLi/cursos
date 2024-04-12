class Mamifero : Animal
{
    public string Alimento;
    public Mamifero(string nome, double comprimento, int patas, string cor, double velocidade, string alimento)
    {
        this.Nome = nome;
        this.Comprimento = comprimento;
        this.Patas = patas;
        this.Cor = cor;
        this.Ambiente = "Terra";
        this.Velocidade = velocidade;
        this.Alimento = alimento;
    }

    public override string ToString()
    {
        string str = "";
        str += "\nAnimal: " + this.Nome;
        str += "\nComprimento: " + this.Comprimento + " cm";
        str += "\nPatas: " + this.Patas;
        str += "\nCor: " + this.Cor;
        str += "\nAmbiente: " + this.Ambiente;
        str += "\nVelocidade: " + this.Velocidade + " m/s";
        str += "\nAlimento: " + this.Alimento;

        return str;
    }
}