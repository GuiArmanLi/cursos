programa
{
	funcao inteiro maiorValor(inteiro valor1, inteiro valor2, inteiro valor3){
		inteiro retorno = 0
		
		se(retorno < valor1){
			retorno = valor1
		}

		se(retorno < valor2){
			retorno = valor2
		}

		se(retorno < valor3){
			retorno = valor3
		}

		retorne retorno
	}
	
	funcao inicio()
	{
		inteiro valor1, valor2, valor3, resultado
		escreva("Digite 3 valores!\n")
		leia(valor1, valor2, valor3)
		limpa()

		resultado = maiorValor(valor1, valor2, valor3)

		escreva("O maior valor é " + resultado)
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 518; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */