programa
{
	inclua biblioteca Matematica-->mat
	
	funcao inicio()
	{
		cadeia nome
		inteiro idade
		real imc, altura, peso

		escreva("--- PROGRAMA DE CALCULO DO IMC ---\n\n")
		escreva("Escreva seu nome: ")
		leia(nome)
		escreva("\nEscreva sua idade: ")
		leia(idade)
		escreva("\nEscreva seu peso: ")
		leia(peso)
		escreva("\nEscreva sua altura: ")
		leia(altura)
		imc = peso/(altura*altura)
		escreva("--- Tabela IMC ---\n")
		escreva("\nNome   : ", nome)
		escreva("\nPeso   : ", peso)
		escreva("\nIdade  : ", idade)
		escreva("\nAltura : ", altura)
		escreva("\nIMC    : ", mat.arredondar(imc, 2))

		se (imc <= 18.4) {
			escreva("\nMagreza\n\n")
			}senao se (imc <= 24.9){
				escreva("\nNormal\n\n")
				} senao se (imc <= 29.9) {
					escreva("\nSobrepeso\n\n")
					} senao se (imc <= 40) {
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
 * @POSICAO-CURSOR = 288; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */