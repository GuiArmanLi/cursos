programa
{ 
	funcao inicio()
	{
		cadeia nomeDigitado = ""
		escreva("Digite o nome de Filomena ou de Joselito para saber a rotina de cada.\n")
		leia(nomeDigitado)
		limpa()
		
		se (nomeDigitado == "Filomena"){
			escreva("1. Escola das 07h às 12h \n2. Almoço das 12h as 13 \n3. Futebol das 14h as 16h \n4. Dever de casa das 16h as 18h")
			
		} senao se (nomeDigitado == "Joselito"){
				escreva("1. Escola das 07h às 12:30 \n2. Almoço das 13h as 14h \n3. Natação das 14h as 16h \n4. Reforço escolar das 16h as 19h")
		
		} senao {
			escreva("Nome digitado invalido")
				
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 11; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */