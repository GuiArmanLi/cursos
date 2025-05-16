using System;

class Ex4
{
    static void Main(string[] args)
    {
        string[,] agenda = new string[31, 24];

        Console.WriteLine("Para agendar um compromisso na agenda, digite o compromisso, um dia e um horario.");

        while (true)
        {
            string compromisso = Console.ReadLine();
            int dia = int.Parse(Console.ReadLine());
            int horario = int.Parse(Console.ReadLine());

            dia--;
            if (agenda[dia, horario] != null)
            {
                Console.WriteLine("Dia {0} as {1} horas ja tem um compromisso", dia, horario);
            }
            agenda[dia, horario] = compromisso;

            Console.WriteLine("Deseja agendar um novo compromisso? [1] - Sim | [2] - Nao");

            string repeat = Console.ReadLine();
            if (repeat == "2") break;
        }

        for (int i = 0; i < agenda.GetLength(0); i++)
        {
            Console.WriteLine("Dia {0}", i + 1);
            for (int j = 0; j < agenda.GetLength(1); j++)
            {
                Console.WriteLine("{0} horas: {1}", j, agenda[i, j]);
            }
        }
    }
}