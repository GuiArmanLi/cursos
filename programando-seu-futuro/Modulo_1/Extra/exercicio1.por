programa
{
	inclua biblioteca Matematica --> M
	funcao inicio()
	{
		real catetoAdjascente = 0.0, catetoOposto = 0.0, hipotenusa = 0.0

		escreva("Digite os valores dos catetos adjascente e oposto:\n")
		leia(catetoAdjascente, catetoOposto)
		limpa()

		hipotenusa = M.raiz((M.potencia(catetoAdjascente, 2.0)) + (M.potencia(catetoOposto,2.0)),2.0)

		escreva("O valor da hipotenusa é:\t" + hipotenusa)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 410; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */