programa
{
	funcao inicio()
	{
		cadeia usuario = "", senha = ""
		inteiro contador = 0

		escreva("Digite o usuário e a senha.\n")
		leia(usuario, senha)
		limpa()
		
		se (usuario == "admin" e senha == "123"){
			escreva("Login realizado com sucesso")
		}
		senao se (usuario != "admin" ou senha != "123"){
			faca {
			escreva("Usuário ou senha incorreto. Por favor, digite novamente: \n")
			leia(usuario, senha)
			limpa()
				se(usuario == "admin" e senha == "123"){
					escreva("Login realizado com sucesso\n")
					contador = 3
				}
				se(contador == 2){
				escreva("Sua conta foi bloqueada.\n")
				}
			contador++
			}enquanto (contador < 3)
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 10; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */