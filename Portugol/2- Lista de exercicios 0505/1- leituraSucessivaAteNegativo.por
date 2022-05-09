programa
{
	
	funcao inicio()
	{
		/*1- Elaborar um programa que efetue a leitura sucessiva de valores numéricos e apresente no 
		  final o total do somatório, a média e o total de valores lidos. O programa deve fazer as 
		  leituras dos valores enquanto o usuário estiver fornecendo valores positivos. Ou seja, o programa 
		  deve parar quando o usuário fornecer um valor negativo
		*/
		
		inteiro num=1, total=0, soma=0
		real media=0.0
		
		enquanto (num > 0) {
			escreva("\nEscreva um número positivo para somar ou negativo para parar o programa: ")
			leia(num)
			se (num < 0 ) {
				pare
				}
			soma = soma + num
			total++
			}
			media = soma/total
			escreva("\n\n--- TABELA DE INFORMAÇÕES ---\n")
			escreva("Média: ", media)
			escreva("\nTotal: ", total)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 392; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {num, 12, 10, 3}-{total, 12, 17, 5}-{soma, 12, 26, 4}-{media, 13, 7, 5};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */