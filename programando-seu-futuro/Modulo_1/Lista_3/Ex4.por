programa
{
	funcao inicio()
	{
		inteiro quantidadeDeItens = 0, contador = 0
		real totalDaCompra = 0.0, valorDaCompra = 0.0
		cadeia item

		escreva("Qual foi a quantidade de itens que vossa senhoria comprou? \t")
		leia(quantidadeDeItens)
		limpa()

		enquanto (contador < quantidadeDeItens){
			escreva("Qual foi o item comprado?\n")
			leia(item)
			escreva("Qual o valor do item que vossa senhoria comprou?\n")
			leia(valorDaCompra)

			totalDaCompra = totalDaCompra + valorDaCompra
			contador++
			limpa()
		}
		
		se(totalDaCompra > 90.0){
		escreva("Parabens, voce ganhou frete gratis em sua compra de valor " + totalDaCompra)				
		}

		senao {
			escreva("A compra nao possui frete gratis!")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 12; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {quantidadeDeItens, 5, 10, 17}-{contador, 5, 33, 8};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */