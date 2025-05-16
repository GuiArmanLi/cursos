programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		inteiro matriz[3][3]
		inteiro somatorio1 = 0, somatorio2 = 0
		inteiro aposta

		para (inteiro i = 0; i < 3; i++){
			para(inteiro j = 0; j < 3; j++){
				matriz[i][j] = sorteia(1, 9)

				se(i == j){
					somatorio1 = somatorio1 + matriz[i][j]
				}

				se(i + j == 2){
					somatorio2 = somatorio2 + matriz[i][j]
				}
			}
		}
		
		escreva("1 = Diagonal Principal\t2 = Diagonal Secundaria\n")
		leia(aposta)
		limpa()

		se(somatorio1 > somatorio2){
			escreva("Parabens, voce ganhou!")
		}
		
		senao se (somatorio1 < somatorio2){
			escreva("Parabens, voce perdeu!")
		}

		senao se (somatorio1 == somatorio2){
			escreva("Empate!")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 60; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {matriz, 7, 10, 6};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */