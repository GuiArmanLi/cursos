programa
{
	funcao inteiro maiorValor(inteiro vetor[]){
		inteiro resultado = 0
		para(inteiro i = 0; i < 10; i++){
			se(vetor[i] > resultado){
				resultado = vetor[i]
			}
		}
		retorne resultado
	}

	funcao inteiro menorValor(inteiro vetor[]){
		inteiro resultado = 10
		para(inteiro i = 0; i < 10; i++){
			se(vetor[i] < resultado){
				resultado = vetor[i]
			}
		}
		retorne resultado
	}

	funcao inteiro somatoriaDosValores(inteiro vetor[]){
		inteiro resultado = 0
		para(inteiro i = 0; i < 10; i++){
			resultado += vetor[i]
		}
		retorne resultado
	}

	funcao inteiro mediaDosValores(inteiro vetor[]){
		inteiro resultado = 0
		para(inteiro i = 0; i < 10; i++){
			resultado += vetor[i]
		}
		retorne resultado / 10
	}

	
	funcao inicio()
	{
		inteiro vetor[10]
		inteiro resultadoDoMaiorValor, resultadoDoMenorValor, resultadoDaSomatoria, resultadoDaMedia

		para(inteiro i = 0; i < 10; i++){
			vetor[i] = sorteia(1,9)
		}

		resultadoDoMaiorValor = maiorValor(vetor)
		resultadoDoMenorValor = menorValor(vetor)
		resultadoDaSomatoria = somatoriaDosValores(vetor)
		resultadoDaMedia = mediaDosValores(vetor)

		escreva("O maior valor é " + resultadoDoMaiorValor + "\n")
		escreva("O menor valor é " + resultadoDoMenorValor + "\n")
		escreva("O valor do somatório é " + resultadoDaSomatoria + "\n")
		escreva("O valor da média é " + resultadoDaMedia + "\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 868; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {vetor, 3, 35, 5};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */