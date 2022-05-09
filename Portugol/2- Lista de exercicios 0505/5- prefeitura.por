programa
{
	inclua biblioteca Matematica-->mat
	
	funcao inicio()
	{
		/*1- A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes, 
		     coletando dados sobre o salário e número de filhos. A prefeitura deseja saber:   
			a) média do salário da população; 
			b) média do número de filhos; 
			c) maior salário; 
			d) percentual de pessoas com salário até R$100,00.
		 */
		inteiro numFilhos = 0, pessoasSalario100 = 0
		real numPessoas = 1.0, salario = 0.0, totalFilhos = 0.0, mediaSalario = 0.0, maiorSalario = 0.0, percentual100 = 0.0, mediaFilhos = 0.0, totalSalario = 0.0
		
		para (numPessoas = 1.0; numPessoas <= 5; numPessoas++) {
			
			escreva("\nPessoa ", numPessoas," - Informe o salario: ")
			leia(salario)
			escreva("\nPessoa ", numPessoas," - Informe o número de filhos: ")
			leia(numFilhos)
			
			totalFilhos = totalFilhos + numFilhos
			totalSalario = totalSalario + salario
			se (salario <= 100) {
				pessoasSalario100++
				}
			se (salario > maiorSalario) {
				maiorSalario = salario
				}
			percentual100 = (pessoasSalario100/numPessoas)*100
			mediaSalario = totalSalario/numPessoas
			mediaFilhos = totalFilhos/numPessoas
			}
		
		
		escreva("\n\n--- TABELA DE INFORMAÇÕES ---")
		escreva("\nA média de salário da população é: ", mediaSalario)
		escreva("\nA média de filhos da população é: ", mediaFilhos)
		escreva("\nMaior salário: ", maiorSalario)
		escreva("\nNúmero de pessoas que ganham até 100 reais: ", pessoasSalario100)
		escreva("\nPercentual de pessoas com salário até R$100,00: ", mat.arredondar(percentual100, 2),"\n\n")

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 600; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {numFilhos, 14, 10, 9}-{pessoasSalario100, 14, 25, 17}-{numPessoas, 15, 7, 10};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */