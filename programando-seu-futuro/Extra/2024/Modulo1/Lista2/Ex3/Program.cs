namespace Ex3;

class Program
{
    public static void Main(string[] args)
    {
        Console.WriteLine("Digite o nome de Joselito ou Filomena para descobrir sua rotina: \t");
        string name = Console.ReadLine();

        if (name == "Joselito")
        {
            Console.WriteLine("\nRotina de Joselito:\n1. Escola das 07h as 12:30 \n2. Almoço das 13h as 14h \n3. Natação das 14h as 16h \n4. Reforço escolar das 16h as 19h\n");
        }
        else if (name == "Filomena")
        {
            Console.WriteLine("\nRotina de Filomena:\n1. Escola das 07h as 12h \n2. Almoço das 12h as 13 \n3. Futebol das 14h as 16h \n4. Dever de casa das 16h as 18h\n");
        }
        else
        {
            Console.WriteLine("Nome invalido!\n");
        }
    }
}