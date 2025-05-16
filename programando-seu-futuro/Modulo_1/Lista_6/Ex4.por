programa
{
	funcao cadeia acharZero(inteiro matriz[][]){
		cadeia resultado = ""
		para(inteiro i = 0; i < 9; i++){
			para(inteiro j = 0; j < 9; j++){
				se(matriz[i][j] == 0){
					resultado = "Fique atento! existem balistas no tabuleiro."
				}
				senao{
					resultado = "Não há balistas no tabuleiro."
				}
			}
		}
		retorne resultado
	}
	
	funcao inicio()
	{
		inteiro matriz[9][9]
		cadeia resultado = ""

		para(inteiro i = 0; i < 9; i++){
			para(inteiro j = 0; j < 9; j++){
				matriz[i][j] = sorteia(0,9)
			}
		}
		resultado = acharZero(matriz)

		escreva(resultado)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 533; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {matriz, 3, 34, 6}-{matriz, 20, 10, 6};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */