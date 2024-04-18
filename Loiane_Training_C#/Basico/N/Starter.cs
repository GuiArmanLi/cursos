using System;

class Starter
{
    static void Main(string[] args)
    {
        Agenda agenda = new Agenda();

        Contato contato1 = new Contato("Colossus", "40028922");
        Contato contato2 = new Contato("T-Rex", "38741393");
        Contato contato3 = new Contato("Super choque", "34525341");
        Contato contato4 = new Contato("Guilherme Cabeca", "39585930");
        Contato contato5 = new Contato("Mega mente", "324234523");

        agenda.AdicionarContato(contato1);
        Console.WriteLine();
        agenda.AdicionarContato(contato2);
        agenda.AdicionarContato(contato3);
        agenda.AdicionarContato(contato5);

        Console.WriteLine(agenda.ConsultarContato(0));
        Console.WriteLine(agenda.ConsultarContato(1));
        Console.WriteLine(agenda.ConsultarContato(3));
        Console.WriteLine(agenda.ConsultarContato(5));

        Console.WriteLine(agenda.ToString());
        //Fazer whiile com 1 para add e 2 para consultar
    }
}