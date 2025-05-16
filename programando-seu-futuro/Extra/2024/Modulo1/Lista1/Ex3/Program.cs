Console.WriteLine("Digite um numero!");
int centavos = int.Parse(Console.ReadLine());

int reais = centavos / 100;
centavos %= 100;

Console.WriteLine("Total em dinheiro: " + reais + " real(is) e " + centavos + " centavo(s)");
Console.WriteLine("Total: R$" + reais + "," + centavos);
