class Curso
{
    public string Nome;
    public string Horario;
    public Professor Professor;
    public Aluno[] Alunos;

    public Curso(string nome, string horario)
    {
        this.Nome = nome;
        this.Horario = horario;
    }
}