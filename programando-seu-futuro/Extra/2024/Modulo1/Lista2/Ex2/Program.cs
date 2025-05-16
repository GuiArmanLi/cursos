Console.WriteLine("Digite a 1 nota do aluno: ");
double nota1 = double.Parse(Console.ReadLine());

Console.WriteLine("Digite a 2 nota do aluno: ");
double nota2 = double.Parse(Console.ReadLine());

Console.WriteLine("Digite a 3 nota do aluno: ");
double nota3 = double.Parse(Console.ReadLine());

Console.WriteLine("Digite a 4 nota do aluno: ");
double nota4 = double.Parse(Console.ReadLine());

double media = (nota1 + nota2 + nota3 + nota4) / 4;

if (media >= 5)
{
    Console.WriteLine("Aluno Aprovado!");
}
else if (media < 5 && media >= 3)
{
    Console.WriteLine("Aluno em Recuperacao!");
}
else
{
    Console.WriteLine("Aluno Reprovado!");
}