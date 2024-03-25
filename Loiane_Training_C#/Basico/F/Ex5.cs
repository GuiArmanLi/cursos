using System;

class Ex5
{
    static void Main(string[] args)
    {
        string[,,] agenda = new string[12, 31, 8];

        Console.WriteLine("Para agendar um compromisso na agenda, digite o compromisso, um mes, um dia e um horario ate 8h.");

        while (true)
        {
            string compromisso = Console.ReadLine();
            int mes = int.Parse(Console.ReadLine());
            int dia = int.Parse(Console.ReadLine());
            int horario = int.Parse(Console.ReadLine());

            if (agenda[mes - 1, dia - 1, horario] != null)
            {
                Console.WriteLine("Mes {0}, Dia {1} as {2} horas ja tem um compromisso", mes, dia, horario);
            }
            agenda[mes - 1, dia - 1, horario] = compromisso;

            Console.WriteLine("Deseja agendar um novo compromisso? [1] - Sim | [2] - Nao");

            string repeat = Console.ReadLine();
            if (repeat == "2") break;
        }

        for (int i = 0; i < agenda.GetLength(0); i++)
        {
            Console.Write("\nMes {0}", i + 1);

            for (int j = 0; j < agenda.GetLength(1); j++)
            {
                Console.Write("\nDia {0}", j + 1);

                for (int k = 0; k < agenda.GetLength(2); k++)
                {
                    Console.Write("\t{0} horas: {1}", k + 1, agenda[i, j, k]);
                }
            }
        }
    }
}