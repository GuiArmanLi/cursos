using System;

class Starter
{
    static void Main(string[] args)
    {
        Agenda agenda = new Agenda();

        for (; ; )
        {
            Console.WriteLine("[0] - Fechar Agenda");
            Console.WriteLine("[1] - Adicionar Contato");
            Console.WriteLine("[2] - Consultar Contato");
            int opcao = int.Parse(Console.ReadLine());

            string resposta = "";
            switch (opcao)
            {
                case 0:
                    Console.WriteLine(agenda.ToString());
                    return;

                case 1:
                    try
                    {
                        Console.Write("Digite o nome do contato: ");
                        string nome = Console.ReadLine();
                        if (nome.Length > 15)
                        {
                            throw new Exception("Nome do contato muito longo!");
                        }

                        Console.Write("Digite o telefone do contato: ");
                        string telefone = Console.ReadLine();
                        if (telefone.Length != 8 || telefone.Length != 9 || telefone.Length != 11)
                        {
                            throw new Exception("Numero incorreto!");
                        }

                        resposta = agenda.AdicionarContato(new Contato(nome, telefone));
                        System.Console.WriteLine(resposta);

                    }
                    catch (Exception e)
                    {
                        Console.WriteLine(e.Message);
                    }

                    break;

                case 2:
                    Console.Write("Digite o Id do contato que deseja consultar: ");
                    long id = long.Parse(Console.ReadLine());

                    resposta = agenda.ConsultarContato(id);
                    Console.WriteLine(resposta);
                    break;

                default:
                    Console.WriteLine("Opcao invalida!");
                    break;
            }
        }
    }
}