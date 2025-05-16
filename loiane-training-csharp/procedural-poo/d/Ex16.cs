using System;

class Ex16
{
    static void Main(string[] args)
    {
        Console.Write("Digite quantas vezes deseja repetir fibonacci: ");
        int quantidade = int.Parse(Console.ReadLine());

        int anterior = 0;
        int atual = 1;
        for (int i = 0; i < quantidade; i++)
        {
            Console.Write(anterior + " ");

            int proximo = anterior + atual;
            anterior = atual;
            atual = proximo;

            if (proximo > 500)
            {
                Console.Write(anterior + " ");
                break;
            }
        }
    }
}
