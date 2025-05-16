programa
{
	funcao logico fazerLogin(cadeia usuario, inteiro senha){
		escreva("Digite seu usuario e sua senha!\n")
		leia(usuario, senha)
		limpa()
		
		logico resultado
		se(usuario == "admin" e senha == 123){
			resultado = verdadeiro
		}
		senao {
			resultado = falso
		}
		retorne resultado
	}
	
	funcao inicio()
	{
		cadeia usuario = ""
		inteiro senha = 0
		logico resultado

		resultado = fazerLogin(usuario, senha)

		se(resultado == verdadeiro){
			escreva("Login Realizado com sucesso!")
		}
		senao se(resultado == falso){
			escreva("Usuário ou senha incompatível")
		}
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 503; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */