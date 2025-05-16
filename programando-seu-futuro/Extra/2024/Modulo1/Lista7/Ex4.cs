using System;

class Ex4
{
    static void Main(string[] args)
    {
        int[] trem = new int[12];

        PreencherVetor(trem);
        VerificarVagoesAcimaDoPeso(trem);
    }

    static void PreencherVetor(int[] trem)
    {
        for (int i = 0; i < trem.Length; i++)
        {
            trem[i] = int.Parse(Console.ReadLine());
        }
    }

    static void VerificarVagoesAcimaDoPeso(int[] trem)
    {
        for (int i = 0; i < trem.Length; i++)
        {
            if (trem[i] > 50)
            {
                Console.WriteLine("{0}° vagao ultrapassou o limite de peso", i + 1);
            }
        }
    }
}