programa
{
	
	funcao inicio()
	{
		// programa salario
		real codigo, hTrab, salario=0, valorH = 10.0, excesso

		escreva("Insira o código do trabalhador: ")
		leia(codigo)
		escreva("Insira as horas trabalhadas: ")
		leia(hTrab)
		
		se (hTrab > 50) {
			salario = 500
			excesso = (hTrab - 50) * (valorH * 2)
			salario = salario + excesso
			} senao {
				salario = hTrab * valorH
				excesso = 0.0
				}
				
		escreva("\n--- TABELA DE SALÁRIO DO TRABALHADOR ---")
		escreva("\nCodigo-Trab      : ", codigo)
		escreva("\nSalário          : ",salario,"R$\n")
		escreva("Salário Excedente: ",excesso,"R$\n\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 373; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */