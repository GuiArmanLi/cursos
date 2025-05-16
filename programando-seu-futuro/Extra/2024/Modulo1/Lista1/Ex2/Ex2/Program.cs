Console.WriteLine("Vamos calcular um triangulo");

Console.WriteLine("Digite a base");
double _base = double.Parse(Console.ReadLine());

Console.WriteLine("Digite a altura");
double altura = double.Parse(Console.ReadLine());

double area = (_base * altura) / 2;

bool isGreater = area > 20;
Console.WriteLine("Area do triangulo e maior que 20? " + isGreater);