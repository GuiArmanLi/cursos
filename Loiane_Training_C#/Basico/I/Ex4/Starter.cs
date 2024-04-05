using System;

class Starter
{
    static void Main(string[] args)
    {
        int contador = 2;
        Console.WriteLine("{0} Metros quadrados para {1} Pes quadrados", contador, ConversaoDeUnidadesDeArea.MetrosQuadradosParaPesQuadrados(contador));
        contador++;

        Console.WriteLine("{0} Metros quadrados para {1} Pes quadrados", contador, ConversaoDeUnidadesDeArea.MetrosQuadradosParaPesQuadrados(contador));
        contador++;

        Console.WriteLine("{0} Pes quadrados para {1} Centimetros quadrados", contador, ConversaoDeUnidadesDeArea.PesQuadradoParaCentimetrosQuadrados(contador));
        contador++;

        Console.WriteLine("{0} Milhas quadradas para {1} Acres", contador, ConversaoDeUnidadesDeArea.MilhasQuadradaParaAcres(contador));
        contador++;
        
        Console.WriteLine("{0} Acres para {1} Pes quadrados", contador, ConversaoDeUnidadesDeArea.AcreParaPesQuadrados(contador));
    }
}