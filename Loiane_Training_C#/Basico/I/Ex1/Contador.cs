using System;

class Contador
{
    public static int contador;

    Contador()
    {
        Contador.contador++;
    }

    void ZerarContador()
    {
        Contador.contador = 0;
    }

    void IncrementarContador()
    {
        Contador.contador++;
        Console.WriteLine("Contador: " + contador);
    }

    static void Main(string[] args)
    {
        Contador contador1 = new Contador();
        Contador contador2 = new Contador();
        Contador contador3 = new Contador();
        Console.WriteLine(Contador.contador);
        contador1.IncrementarContador();
    }
}