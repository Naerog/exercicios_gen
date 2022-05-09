programa
{
	
	funcao inicio()
	{
		real base, altura, area

		escreva("Digite o valor da base  : ")
		leia(base)
		escreva("Digite o valor da altura: ")
		leia(altura)

		se (base <= 0 e altura <= 0) {
			escreva("\nValores inválidos")
			} senao {
				area = (base*altura)/2
				escreva("\nA área é : ", area,"\n\n")
				}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 328; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */