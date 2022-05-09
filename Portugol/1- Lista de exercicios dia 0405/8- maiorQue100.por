programa
{
	
	funcao inicio()
	{
		inteiro num

		escreva("Digite um numero: ")
		leia(num)

		se (num > 100) {
			escreva("\nO número é maior que 100\n")
			escreva("Número: ",num,"\n\n")
			} senao {
				num = 0
				escreva("\nO número não é maior que 100, será setado para 0.\n")
				escreva("Número: ", num,"\n\n")
				}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 285; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */