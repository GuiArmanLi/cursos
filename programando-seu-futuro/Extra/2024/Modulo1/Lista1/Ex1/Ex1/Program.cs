Console.WriteLine("Digite 4 notas para um aluno!");
double nota1 = double.Parse(Console.ReadLine());
double nota2 = double.Parse(Console.ReadLine());
double nota3 = double.Parse(Console.ReadLine());
double nota4 = double.Parse(Console.ReadLine());

double media = (nota1 + nota2 + nota3 + nota4) / 4;

Console.WriteLine("Media do Aluno: " + media);