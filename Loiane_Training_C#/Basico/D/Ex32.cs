using System;

class Ex32
{
    static void Main(string[] args)
    {
        Console.Write("Digite um numero para calcular seu fatorial: ");
        int numero = int.Parse(Console.ReadLine());

        Console.WriteLine("Fatorial de {0}", numero);
        Console.Write("{0}! = ", numero);

        int fatorial = 1;
        for (int i = numero; i > 0; i--)
        {
            if (i != 1)
            {
                Console.Write("{0} . ", i);
            }
            else
            {
                Console.Write("{0} = ", i);
            }
            fatorial *= i;
        }

        Console.WriteLine(fatorial);
    }
}
