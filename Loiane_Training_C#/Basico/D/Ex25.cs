using System;

class Ex25
{
    static void Main(string[] args)
    {
        Console.WriteLine("Digite a quantidade de pessoas que deseja entrar");
        int quantidadeDePessoasLidas = int.Parse(Console.ReadLine());

        double sumAge = 0;
        for (int i = 0; i < quantidadeDePessoasLidas; i++)
        {
            double age = double.Parse(Console.ReadLine());

            sumAge += age;
        }

        double media = sumAge / quantidadeDePessoasLidas;

        if (media > 0 && media <= 25)
        {
            Console.Write("Turma Jovem");
        }
        else if (media >= 26 && media <= 60)
        {
            Console.Write("Turma Adulta");
        }
        else
        {
            Console.Write("Turma Idosa");
        }
    }
}
