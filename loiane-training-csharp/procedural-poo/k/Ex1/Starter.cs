using System;

class Starter
{
    static void Main(string[] args)
    {
        Agenda agenda = new Agenda();

        for (int i = 0; i < agenda.contatos.Length; i++)
        {
            Console.WriteLine("Digite o nome do {0} contato", i + 1);
            string nome = Console.ReadLine();
            agenda.contatos[i].nome = nome;

            Console.WriteLine("Digite o telefone do {0} contato", i + 1);
            string telefone = Console.ReadLine();
            agenda.contatos[i].telefone = telefone;

            Console.WriteLine("Digite o email do {0} contato", i + 1);
            string email = Console.ReadLine();
            agenda.contatos[i].email = email;
        }

        for (int i = 0; i < agenda.contatos.Length; i++)
        {
            Console.WriteLine("Nome do {0} contato: {1}", i + 1, agenda.contatos[i].nome);
            Console.WriteLine("Telefone do {0} contato: {1}", i + 1, agenda.contatos[i].telefone);
            Console.WriteLine("Email do {0} contato: {1}", i + 1, agenda.contatos[i].email);
        }
    }
}