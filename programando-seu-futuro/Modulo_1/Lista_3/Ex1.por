programa
{
	funcao inicio()
	{
		cadeia jogador1, jogador2
		inteiro opcao1, opcao2, pontuacaoJogador1 = 0, pontuacaoJogador2 = 0, rodadas = 0
	
		escreva("Digite no nome do primeiro Jogador e o nome do segundo Jogador!\n")
		leia(jogador1, jogador2)
		limpa()

		escreva("Quantas rodadas? \t")
		leia(rodadas)
		limpa()

		enquanto (rodadas > pontuacaoJogador1 ou rodadas > pontuacaoJogador2){
		escreva("Primeiro Jogador, Digite:\n1 - Tesoura \t2 - Pedra\t 3 - Papel\n")
		leia(opcao1)
		limpa()
	
		escreva("Segundo Jogador, Digite:\n1 - Tesoura \t2 - Pedra\t 3 - Papel\n")
		leia(opcao2)
		limpa()
		
			se(opcao1 == 1){
				se (opcao2 == 1){
					escreva("Empate! \n2")
				}
				senao se(opcao2 == 2){
					pontuacaoJogador2++
				}
				senao se(opcao2 == 3){
					pontuacaoJogador1++
				}
			}
			se(opcao1 == 2){
				se (opcao2 == 1){
					pontuacaoJogador1++
				}
				senao se(opcao2 == 2){
					escreva("Empate! \n")
				}
				senao se(opcao2 == 3){
					pontuacaoJogador2++
				}
			}
			se(opcao1 == 3){
				se (opcao2 == 1){
					pontuacaoJogador2++
				}
		
				senao se(opcao2 == 2){
					pontuacaoJogador1++
				}
		
				senao se(opcao2 == 3){
					escreva("Empate! \n")
				}
			}
			se(pontuacaoJogador1 == rodadas ou pontuacaoJogador2 == rodadas){
				pare
			}
		}
		
		limpa()
		se (pontuacaoJogador1 == rodadas){
		escreva("O jogador " + jogador1 + " venceu\n")
		}
		senao se (pontuacaoJogador2 == rodadas){
			escreva("O jogador " + jogador2 + " venceu\n")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1289; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */