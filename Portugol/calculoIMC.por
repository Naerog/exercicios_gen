programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
		//Calculo IMC

		cadeia nome
		inteiro idade
		real imc, altura, peso

		escreva("--- PROGRAMA DE CALCULO DO IMC ---\n\n")
		escreva("Escreva seu nome:\n")
		leia(nome)
		escreva("\nEscreva sua idade:\n")
		leia(idade)
		escreva("\nEscreva seu peso:\n")
		leia(peso)
		escreva("\nEscreva sua altura:\n")
		leia(altura)
		imc = peso/(altura*altura)
		escreva("--- Tabela IMC ---\n")
		escreva("\nNome   : ", nome)
		escreva("\nPeso   : ", peso)
		escreva("\nIdade  : ", idade)
		escreva("\nAltura : ", altura)
		escreva("\nIMC    : ", Matematica.arredondar(imc, 2))
		se (imc <= 18.4) {
			escreva("\nMagreza\n\n")
			}senao se (imc >= 18.5 e imc <= 24.9){
				escreva("\nNormal\n\n")
				} senao se (imc >= 25 e imc <= 29.9) {
					escreva("\nSobrepeso\n\n")
					} senao se (imc >= 30 e imc <= 40) {
						escreva("\nObesidade\n\n")
						} senao {
							escreva("\nObesidade grave\n\n")
							}

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 963; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */