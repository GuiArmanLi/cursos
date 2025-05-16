using System;

class Ex3
{
    static void Main(string[] args)
    {
        string retorno = ClassificarNadador(int.Parse(args[0]));
        Console.WriteLine("Categoria do nadador: {0}", retorno);
    }

    static string ClassificarNadador(int idade)
    {
        if (idade < 12)
        {
            return "Infantil";
        }
        else if (idade >= 12 && idade <= 14)
        {
            return "Juvenil A";
        }
        else if (idade >= 15 && idade <= 17)
        {
            return "Juvenil B";
        }
        else
        {
            return "Adulto";
        }
    }
}