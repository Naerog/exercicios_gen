programa
{
	funcao inicio()
	{
	inteiro n1,n2,n3,n4

	escreva("O primeiro numero: ")
	leia(n1)
	escreva("\nO segundo numero : ")
	leia(n2)
	escreva("\nO terceiro numero: ")
	leia(n3)
	escreva("\nO quarto numero  : ")
	leia(n4)

	n1 = n1*n1
	n2 = n2*n2
	n3 = n3*n3
	n4 = n4*n4
	
	se (n1 >= 1000) {
		escreva("\nO valor quadrado do primeiro número é maior que 1000: ", n1)
		} senao {
			escreva("\nO primeiro número não é maior que 1000: ",n1)
			}
	se (n2 >= 1000) {
		escreva("\nO valor quadrado do segundo número é maior que 1000: ", n2)
		} senao {
			escreva("\nO segundo número não é maior que 1000: ",n2)
			}
	se (n3 >= 1000) {
		escreva("\nO valor quadrado do terceiro número é maior que 1000: ", n3)
		} senao {
			escreva("\nO terceiro número não é maior que 1000: ",n3)
			}
	se (n4 >= 1000) {
		escreva("\nO valor quadrado do quarto número é maior que 1000: ", n4)
		} senao {
			escreva("\nO quarto número não é maior que 1000: ",n4)
			}
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 458; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */