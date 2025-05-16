programa
{
	funcao inicio()
	{
		inteiro idade1, idade2, idade3

		escreva("Digite a idade de tres pessoas:\n")
		leia(idade1, idade2, idade3)
		limpa()

		se (idade1 > idade2 e idade1 > idade3){
			escreva("A pessoa mais velha é " + idade1)
		}

		senao se(idade2 > idade1 e idade2 > idade3){
			escreva("A pessoa mais velha é " + idade2)
		}

		senao se(idade3 > idade1 e idade3 > idade1){
			escreva("A pessoa mais velha é " + idade3)
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 30; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */