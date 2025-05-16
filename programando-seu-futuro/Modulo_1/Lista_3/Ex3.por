programa
{
	funcao inicio()
	{
		real salario, mediaSalario = 0.0, maiorSalario = 0.0, percentualDoSalario = 0.0, percentualDoSalarioDosHabitantes = 0.0
		inteiro contagemHabitante = 1, filhos = 0, QuantidadeDeFilhos = 0, quantidadeDeHabitantes = 0

		escreva("Qual a quantidade de habitantes que vossa senhoria gostaria de avaliar? \t")
		leia(quantidadeDeHabitantes)

		enquanto(contagemHabitante <= quantidadeDeHabitantes){
			escreva("Digite o salario do " + contagemHabitante + "ö habitante!\n")
			leia(salario)
			mediaSalario = mediaSalario + salario
			
			escreva("Digite o numero de filhos que o " + contagemHabitante + "ö habitante tem!\n")
			leia(filhos)
			QuantidadeDeFilhos = QuantidadeDeFilhos + filhos

			se (salario > maiorSalario){
				maiorSalario = salario
			}

			se (salario < 1000){
				percentualDoSalario++
			}

			limpa()
			percentualDoSalarioDosHabitantes = percentualDoSalario * 100 / quantidadeDeHabitantes
			contagemHabitante++
		}
		limpa()
		escreva("A media salarial dos habitantes corresponde a " + mediaSalario / quantidadeDeHabitantes)
		escreva("\nA media de filhos dos habitantes corresponde a " + QuantidadeDeFilhos / quantidadeDeHabitantes)
		escreva("\nO maior salario dentre os habitantes corresponde a " + maiorSalario)
		escreva("\nO percentual de pessoas com salario menor que R$1000,00 corresponde a " + percentualDoSalarioDosHabitantes + "%")
	}	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 419; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */