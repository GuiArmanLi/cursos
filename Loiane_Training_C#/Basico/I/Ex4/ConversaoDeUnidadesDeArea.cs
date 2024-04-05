using System;

class ConversaoDeUnidadesDeArea
{
    

    public static double MetrosQuadradosParaPesQuadrados(double metros)
    {
        return metros * 10.76;
    }

    public static double PesQuadradoParaCentimetrosQuadrados(double pesQuadrados)
    {
        return pesQuadrados * 929;
    }

    public static double MilhasQuadradaParaAcres(double milhasQuadrada)
    {
        return milhasQuadrada * 640;
    }

    public static double AcreParaPesQuadrados(double acres)
    {
        return acres * 43.560;
    }

}