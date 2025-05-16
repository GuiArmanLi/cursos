using System;

class Starter
{
    static void Main(string[] args)
    {
        Curso curso = new Curso("Engenharia Biomedica", "18-23");
        curso.Professor = new Professor("Rodrigo", "Biotecnologia", "rodriguinDaMata@gmail.com");

        int[,] listaDeNotas = new int[3, 4];
        for (int i = 0; i < listaDeNotas.GetLength(0); i++)
        {
            Console.WriteLine("Digite as 4 ntoas do {0} aluno", i + 1);

            for (int j = 0; j < listaDeNotas.GetLength(1); j++)
            {
                listaDeNotas[i, j] = int.Parse(Console.ReadLine());
            }
        }

        int[] primeiroVetor = new int[listaDeNotas.GetLength(1)];
        int[] segundoVetor = new int[listaDeNotas.GetLength(1)];
        int[] terceiroVetor = new int[listaDeNotas.GetLength(1)];
        for (int i = 0; i < primeiroVetor.Length; i++)
        {
            primeiroVetor[i] = listaDeNotas[0, i];
            segundoVetor[i] = listaDeNotas[1, i];
            terceiroVetor[i] = listaDeNotas[2, i];
        }

        Aluno[] alunos = {
           new Aluno("Guilherme", "007", primeiroVetor),
            new Aluno("Pedro", "123", segundoVetor),
            new Aluno("Cezar", "777", terceiroVetor)
        };

        curso.Alunos = alunos;

        for (int i = 0; i < listaDeNotas.GetLength(0); i++)
        {
            Console.WriteLine("Media do {0} aluno: {1}", alunos[i].Nome, alunos[i].CalcularMedia());
        }
    }
}