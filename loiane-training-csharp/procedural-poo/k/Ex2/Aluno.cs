class Aluno
{
    public string Nome;
    public string Matricula;
    public int[] Notas;

    public Aluno(string nome, string matricula, int[] notas)
    {
        this.Nome = nome;
        this.Matricula = matricula;
        this.Notas = notas;
    }

    public int CalcularMedia()
    {
        int soma = 0;
        for (int i = 0; i < Notas.Length; i++)
        {
            soma += this.Notas[i];
        }

        return soma / Notas.Length;
    }
}