using System;

class Ex1
{
    static void Main(string[] args)
    {
        for (int crescente = 0, decrescente = 200; crescente <= 100; crescente += 2, decrescente -= 4)
        {
            Console.WriteLine("{0} - {1}", crescente, decrescente);
        }
    }
}