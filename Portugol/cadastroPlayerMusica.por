programa
{
	
	funcao inicio()
	{
	// Cadastro de site de música
	cadeia nome, generoFavorito, bandaFavorita, dataDeNascimento 
	inteiro idade

	escreva("Bem vindo ao Player Musical! digite o seu nome\n")
	leia(nome)
	escreva("\nAgora digite a sua idade\n")
	leia(idade)
	escreva("\nQual a data do seu nascimento?\n")
	leia(dataDeNascimento)
	escreva("\nQual seu genero de música favorito?\n")
	leia(generoFavorito)
	escreva("\nQual sua banda favorita?\n")
	leia(bandaFavorita)

	escreva("\n\n***CADASTRO COMPLETO***\n")
	
	escreva("\nSeu nome é ", nome, ", você tem ",idade," anos, seu genero favorito é ", 
	generoFavorito, " e sua banda favorita é ",bandaFavorita,".\n")
	escreva("\n*** Agora iremos criar uma playlist baseada nos seus gostos! aguarde um momento. ***")
	escreva("\n\nGênero        : ",generoFavorito)
	escreva("\n\nBanda Favorita: ",bandaFavorita,"\n\n")

	//Já fiz o código com a ideia de incrementar no futuro
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 930; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */