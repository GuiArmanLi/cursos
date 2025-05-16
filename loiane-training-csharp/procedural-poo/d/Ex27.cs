using System;

class Ex27
{
    static void Main(string[] args)
    {
        Console.WriteLine("Quantas turmas existem na escola? ");
        int quantidadeDeTurmas = int.Parse(Console.ReadLine());

        int totalAlunos = 0;
        for (int i = 0; i < quantidadeDeTurmas; i++)
        {
            int quantidadeDeAlunos;
            do
            {
                Console.WriteLine("Quantos alunos existem na turma {0}? ", i + 1);
                quantidadeDeAlunos = int.Parse(Console.ReadLine());
            } while (quantidadeDeAlunos < 0 || quantidadeDeAlunos > 40);

            totalAlunos += quantidadeDeAlunos;
        }

        double media = totalAlunos / quantidadeDeTurmas;

        Console.WriteLine("Media de alunos nas turmas e {0}", media);
    }
}