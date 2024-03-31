using System;

class Ex40
{
    static void Main(string[] args)
    {
        const int QUANTIDADE_DE_CIDADES = 5;
        int maiorIndiceDeAcidentes = int.MinValue;
        int menorIndiceDeAcidentes = int.MaxValue;
        string codigoDaCidadeComMaisAcidadentes = "";
        string codigoDaCidadeComMenosAcidadentes = "";

        System.Console.WriteLine("Pesquisa em {0} cidades no ano de 1999\n", QUANTIDADE_DE_CIDADES);
        int somaVeiculosDePasseio = 0;
        int somaAcidentesCidadesMenos2000Veiculos = 0;
        int contadorCidadesComMenos2000Veiculos = 0;
        for (int i = 0; i < QUANTIDADE_DE_CIDADES; i++)
        {
            Console.Write("Digite o codigo da {0} cidade: ", i + 1);
            string codigo = Console.ReadLine();

            Console.Write("Digite a quantidade acidentes com veiculos: ");
            int numeroDeAcidentesComVeiculos = int.Parse(Console.ReadLine());

            if (numeroDeAcidentesComVeiculos > maiorIndiceDeAcidentes)
            {
                maiorIndiceDeAcidentes = numeroDeAcidentesComVeiculos;
                codigoDaCidadeComMaisAcidadentes = codigo;
            }
            else if (numeroDeAcidentesComVeiculos < menorIndiceDeAcidentes)
            {
                menorIndiceDeAcidentes = numeroDeAcidentesComVeiculos;
                codigoDaCidadeComMenosAcidadentes = codigo;
            }

            Console.Write("Digite a quantidade de veiculos de passeio da cidade: ");
            int numeroDeVeiculosDePasseio = int.Parse(Console.ReadLine());

            if (numeroDeVeiculosDePasseio < 2000)
            {
                somaAcidentesCidadesMenos2000Veiculos += numeroDeAcidentesComVeiculos;
                contadorCidadesComMenos2000Veiculos++;
            }

            somaVeiculosDePasseio += numeroDeVeiculosDePasseio;
        }

        Console.WriteLine("Cidade com mais acidentes: {0} - Codigo: {1}", maiorIndiceDeAcidentes, codigoDaCidadeComMaisAcidadentes);
        Console.WriteLine("Cidade com menos acidentes: {0} - Codigo: {1}", menorIndiceDeAcidentes, codigoDaCidadeComMenosAcidadentes);
        Console.WriteLine("Media de veiculos das cidades: {0}", somaVeiculosDePasseio / QUANTIDADE_DE_CIDADES);
        Console.WriteLine("Media de acidentes em cidades com menos de 2000 veiculos: {0}", somaAcidentesCidadesMenos2000Veiculos / contadorCidadesComMenos2000Veiculos);
    }
}