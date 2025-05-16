programa
{
	funcao inicio()
	{
		real numero = 0.0, somatorio = 0.0, mediaDoSomatorio = 0.0
		inteiro totalDeValores = 0
		
		para (inteiro i = 0; numero >= 0 ; i++){
			escreva("Digite os valores que deve somar!\t Numeros negativos finalizam as somas\n")
			leia(numero)
			
			se (numero >= 0){
			somatorio += numero
			}
			
			mediaDoSomatorio = somatorio / i
			totalDeValores = i
		}
		escreva("\nO somatório dos valores lidos é:\t" + somatorio)
		escreva("\nA média dos valores lidos é:\t\t" + mediaDoSomatorio)
		escreva("\nO total de valores lidos:\t\t" + totalDeValores + "\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 242; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */