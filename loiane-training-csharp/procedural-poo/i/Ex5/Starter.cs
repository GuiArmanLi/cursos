using System;

class Starter
{
    static void Main(string[] args)
    {
        int contador = 2;
        Console.WriteLine("{0} Litros para {1} Centimetros cubicos", contador, ConversaoDeUnidadesDeVolume.LitrosParaCentimetrosCubicos(contador));
        contador++;

        Console.WriteLine("{0} Metros cubicos para {1} Litros", contador, ConversaoDeUnidadesDeVolume.MetrosCubicosParaLitros(contador));
        contador++;

        Console.WriteLine("{0} Metros cubicos para {1} Pes cubicos", contador, ConversaoDeUnidadesDeVolume.MetrosCubicosParaPesCubicos(contador));
        contador++;

        Console.WriteLine("{0} Galoes americanos para {1} Polegadas cubicas", contador, ConversaoDeUnidadesDeVolume.GaloesAmericanosParaPolegadasCubicas(contador));
        contador++;

        Console.WriteLine("{0} Galoes americanos para {1} Litros", contador, ConversaoDeUnidadesDeVolume.GaloesAmericanosParaLitros(contador));
    }
}