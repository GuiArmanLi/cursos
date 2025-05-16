programa
{
	funcao inicio()
	{
		inteiro numero = 0, impar = 0, somatorio = 0

		escreva("Digite um número:\t")
		leia(numero)

		para (inteiro i = 1; impar < numero; i++){
			impar = i * 2

			somatorio = somatorio + (impar - 1)	
		}
		escreva(somatorio)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 254; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */