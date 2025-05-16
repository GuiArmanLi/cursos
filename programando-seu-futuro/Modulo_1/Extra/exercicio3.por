programa
{
	funcao inicio()
	{
		cadeia periodoDoDia
		
		escreva("Digite o periodo do dia:\nmanhã\ttarde\tnoite\n")
		leia(periodoDoDia)
		limpa()

		se(periodoDoDia == "manhã"){
			escreva("Remédio A")
		}
		senao se(periodoDoDia == "tarde"){
			escreva("Remédio B")
		}
		senao se(periodoDoDia == "noite"){
			escreva("Remédio C")
		}
		senao{
			escreva("Digite um valor válido!\n")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 179; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */