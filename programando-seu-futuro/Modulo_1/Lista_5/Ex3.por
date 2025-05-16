programa
{	
	funcao inicio()
	{
		 inteiro matriz[4][4]
		 inteiro opcao
		 inteiro somatoria = 0

		 para(inteiro i = 0; i < 4; i++){
		 	para(inteiro j = 0; j < 4; j++){
		 		matriz[i][j] = sorteia(1,9)
		 	}
		 }

		 escreva(
		 "Selecione um das opcoes abaixo:\n\n" +
		 "1 - Imprimir todos os elementos\n" +
		 "2 - Somar todos os elementos e exibir o resultado\n" +
		 "3 - Somar todos os elementos da terceira linha e exibir o resultado\n" +
		 "4 - Somar os elementos da diagonal principal\n" +
		 "5 - Somar todos os elementos de índice par da segunda linha\n")
		 leia(opcao)
		 limpa()

		 se(opcao == 1){
		 	para(inteiro i = 0; i < 4; i++){
			 	para(inteiro j = 0; j < 4; j++){
			 		escreva("|" + matriz[i][j] + "|")
			 	}
			 	escreva("\n")
		 	}
		 }
		 
		 senao se(opcao == 2){
		 	para(inteiro i = 0; i < 4; i++){
			 	para(inteiro j = 0; j < 4; j++){
			 		somatoria = somatoria + matriz[i][j]
			 	}
		 	}
		 	escreva("O valor da somatoria e " + somatoria + "\n")
		 }

		 senao se(opcao == 3){
		 	para(inteiro i = 0; i < 4; i++){
			 	para(inteiro j = 0; j < 4; j++){
			 		se(i == 2){
			 			somatoria = somatoria + matriz[i][j]
			 		}
			 	}
		 	} 	
		 	escreva("O valor da somatoria dos elementos da 3 linha e " + somatoria + "\n")
		 }

		 senao se(opcao == 4){
		 	para(inteiro i = 0; i < 4; i++){
			 	para(inteiro j = 0; j < 4; j++){
			 		se(i == j){
			 			somatoria = somatoria + matriz[i][j]
			 		}
			 	}
		 	} 	
		 	escreva("O valor da somatoria da diagonal principal e " + somatoria + "\n")
		 }

		 senao se(opcao == 5){
		 	para(inteiro i = 0; i < 4; i++){
			 	para(inteiro j = 0; j < 4; j++){
			 		se(i == 1){
			 			se(j % 2 == 0){
			 				somatoria = somatoria + matriz[i][j]
			 			}
			 		}
			 	}
		 	} 	
		 	escreva("O valor da somatoria dos indices par na segunda linha e " + somatoria + "\n")
		 }
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1850; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {matriz, 5, 11, 6};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */