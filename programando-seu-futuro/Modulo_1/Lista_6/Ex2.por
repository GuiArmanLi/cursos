programa
{
	
funcao logico imparOuPar(inteiro numero){
		se (numero % 2 ==0){
			retorne verdadeiro
		} senao {
			retorne falso
		}
	}
	
	funcao inicio()
	{
		inteiro numero
		escreva("Escreva um número!\n")
		leia(numero)
		limpa()

		logico resultado = imparOuPar(numero)

		escreva(resultado)
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 135; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */