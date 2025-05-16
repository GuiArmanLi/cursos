using System;

class Starter
{
    static void Main(string[] args)
    {
        Console.Write("Qual sabor deseja? ");
        string sabor = Console.ReadLine();

        Console.Write("Qual valor para precificar a pizza? ");
        double preco = double.Parse(Console.ReadLine());

        Pizza pizza = new Pizza(sabor, preco);

        Console.WriteLine("Pizza: " + pizza.ToString());
    }
}