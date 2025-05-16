programa
{
	funcao inicio()
	{
		inteiro idade = 0, maiorIdade = 0

		escreva("Digite 3 idades:\n")
		
		para (inteiro i = 0; i < 3; i++){
			leia(idade)
			
			se(idade > maiorIdade){
				maiorIdade = idade
			}
		}
		escreva("A maior idade é: " + maiorIdade)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 141; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */