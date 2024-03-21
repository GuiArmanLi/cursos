using System;

class Ex3
{
    static void Main(string[] args)
    {
        bool repeat = true;
        while (repeat)
        {
            Console.Write("Digite seu nome: ");
            string name = Console.ReadLine();

            Console.Write("Digite sua idade: ");
            int age = int.Parse(Console.ReadLine());

            Console.Write("Digite seu salario : ");
            double salary = double.Parse(Console.ReadLine());

            Console.Write("Digite seu sexo: ");
            char gender = char.Parse(Console.ReadLine());

            Console.Write("Digite seu estado civil: ");
            char state = char.Parse(Console.ReadLine());

            if (name.Length > 3 &&
                (age > 0 && age < 150) &&
                salary > 0 &&
                (gender == 'f' || gender == 'm') &&
                (state == 's' || state == 'c' || state == 'v' || state == 'd'))
            {
                repeat = false;
            }
        }
    }
}