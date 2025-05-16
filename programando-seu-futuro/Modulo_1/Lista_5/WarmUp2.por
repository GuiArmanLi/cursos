programa
{	
	funcao inicio()
	{
		const inteiro coluna = 3, linha = 3
		inteiro matriz[coluna][linha]

		para(inteiro i = 0; i < coluna; i++){
			para(inteiro j = 0; j < linha; j++){
				leia(matriz[i][j])
				se(j % 2 == 0){
					matriz[i][j] *= 2
				}
				se(j % 2 == 1){
					matriz[i][j] *= 3
				}
			}
		}

		para(inteiro i = 0; i < coluna; i++){
			para(inteiro j = 0; j < linha; j++){
				escreva("|" + matriz[i][j] + "|")
			}
			escreva("\n")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 294; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {matriz, 6, 10, 6};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */