using System;

class Starter
{
    static void Main(string[] args)
    {
        int contador = 2;
        Console.WriteLine("{0} Minutos para {1} Segundos", contador, ConversaoDeUnidadesDeTempo.MinutosParaSegundos(contador));
        contador++;

        Console.WriteLine("{0} Horas para {1} Minutos", contador, ConversaoDeUnidadesDeTempo.HorasParaMinutos(contador));
        contador++;

        Console.WriteLine("{0} Dias para {1} Horas", contador, ConversaoDeUnidadesDeTempo.DiasParaHoras(contador));
        contador++;

        Console.WriteLine("{0} Semanas para {1} Dias", contador, ConversaoDeUnidadesDeTempo.SemanasParaDias(contador));
        contador++;

        Console.WriteLine("{0} Meses para {1} Dias", contador, ConversaoDeUnidadesDeTempo.MesesParaDias(contador));

        Console.WriteLine("{0} Anos para {1} Dias", contador, ConversaoDeUnidadesDeTempo.AnosParaDias(contador));
    }
}