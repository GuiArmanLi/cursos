class Peixe : Animal
{
    public string Caracteristicas;
    public Peixe(string nome, double comprimento, double velocidade)
    {
        this.Nome = nome;
        this.Comprimento = comprimento;
        this.Patas = 0;
        this.Cor = "Cinzenta";
        this.Ambiente = "Mar";
        this.Velocidade = velocidade;
        this.Caracteristicas = "Barbatanas e cauda";
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
        str += "\nCaracteristicas: " + this.Caracteristicas;

        return str;
    }
}