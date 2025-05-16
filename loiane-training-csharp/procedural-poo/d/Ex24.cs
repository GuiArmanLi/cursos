using System;

class Ex24
{
    static void Main(string[] args)
    {
        Console.WriteLine("Digite a quantidade de notas que deseja entrar");
        int quantidadeDeNotasLidas = int.Parse(Console.ReadLine());

        double sumGrades = 0;
        for (int i = 0; i <= quantidadeDeNotasLidas; i++)
        {
            double grade = double.Parse(Console.ReadLine());

            sumGrades += grade;
        }

        double media = sumGrades / quantidadeDeNotasLidas;

        Console.WriteLine("Media das notas lidas: " + media);
    }
}
