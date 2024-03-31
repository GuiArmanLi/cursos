using System;

class Ex36
{
    static void Main(string[] args)
    {
        Console.WriteLine("Deseja ver a tabuada de qual numero?");
        int number = int.Parse(Console.ReadLine());

        Console.WriteLine("A tabuada comeca em qual numero?");
        int startAt = int.Parse(Console.ReadLine());

        Console.WriteLine("A tabuada termina em qual numero?");
        int endAt = int.Parse(Console.ReadLine());

        if (startAt > endAt)
        {
            Console.WriteLine("Digitou errado ramelao! Bye bye");
            return;
        }

        Console.WriteLine("Tabuada do {0} comecando por {1} e terminando em {2}", number, startAt, endAt);
        for (int i = startAt; i < endAt; i++)
        {
            Console.WriteLine("{0} * {1} = {2}", number, i, number * i);
        }
    }
}