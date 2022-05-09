programa
{
	
	funcao inicio()
	{
		//poluição

		real indice
		
		
		escreva("Digite o indice de poluição: ")
		leia(indice)

		se (indice < 0.3) {
			escreva("\nTodos continuam trabalhando.")
			} senao se (indice >= 0.3 e indice < 0.4) {
				escreva("\nO grupo 1 deverá paralisar as atividades.")
				} senao se (indice >= 0.4 e indice < 0.5) {
					escreva("\nO grupo 1 e 2 deveram paralisar as atividades.")
					} senao {
						escreva("\nTodos os grupos suspendam as atividades.")
						}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 499; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */