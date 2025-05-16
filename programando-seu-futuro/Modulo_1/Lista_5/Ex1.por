programa
{	
	funcao inicio()
	{
		cadeia vetorNomes [5], vetorCpfs [5]
		cadeia nome, cpf, resposta = ""
		
		para(inteiro i = 0; i < 5; i++){
			leia(vetorNomes[i], vetorCpfs[i])
			limpa()
		}

		escreva("Digite o nome do usuario:\t")
		leia(nome)
		escreva("Digite o cpf do usuario:\t")
		leia(cpf)
		limpa()

		para (inteiro i = 0; i < 5; i++){
			se(vetorNomes[i] == nome e vetorCpfs[i] == cpf){
				resposta = "Aluno aprovado!"
			}
			se(resposta != "Aluno aprovado!"){
				resposta = "Aluno reprovado!"
			}
		}
		escreva(resposta)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 107; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */