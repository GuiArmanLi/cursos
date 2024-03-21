using System;

class Aluno
{
    string name;
    string registration = "1234";
    string course = "Ciencias";
    double[,] subjects = { { 5, 6 }, { 10, 8 }, { 2, 4 } };

    Aluno() { }
    Aluno(string name)
    {
        this.name = name;
    }

    public void IsApprovalInSubjects(int index)
    {
        double sum = 0;
        for (int nota = 0; nota < 2; nota++)
        {
            sum += subjects[index, nota];
        }

        string result = sum / 2 >= 7 ? "Aprovado na disciplpina!" : "Repovado na disciplpina!";

        Console.WriteLine(result);
    }

    static void Main(string[] args)
    {
        Console.WriteLine("Informe seu nome");
        string name = Console.ReadLine();

        Console.WriteLine("Qual disciplina deseja consultar o resultado?");
        Console.WriteLine("[0] - Quimica, [1] - Biologia, [2] - Fisica");
        int subject = int.Parse(Console.ReadLine());

        Aluno aluno = new Aluno(name);

        aluno.IsApprovalInSubjects(subject);
    }
}
