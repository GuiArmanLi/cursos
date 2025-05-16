programa
{
	funcao inicio()
	{
		cadeia usuario
		inteiro senha

		escreva("Digite o usuário: \t")
		leia(usuario)

		escreva("\nDigite a senha: \t")
		leia(senha)
		limpa()

		se(usuario == "admin" e senha == 123){
			escreva("Login realizado com sucesso!")
		}
		senao{
			escreva("Falha no login!")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 305; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */