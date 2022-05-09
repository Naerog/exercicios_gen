programa
{
	
	funcao inicio()
	{
	// Programa dos tomatinhos
		real peso, excesso, multa = 0

		escreva("Insira o peso dos tomates: ")
		leia(peso)
		se (peso > 50) {
			excesso = peso - 50
			multa = excesso * 4
			escreva("\nHouve excesso de: ",excesso,"Kgs\n")
			escreva("Multa: ", multa,"R$\n\n")
		} senao {
			escreva("\nNão houve excesso.\n")
			escreva("Multa: ",multa,"R$\n\n")
			}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 402; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */