programa
{
	/*
	 4.	Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e em seguida, exiba a soma dos valores
	 dela e a soma dos valores da primeira diagonal, ou seja, diagonal principal.
	 */
	inclua biblioteca Util
	
	funcao inicio()
	{
		
		inteiro mat[3][3],l,c,somaDiagonal=0,somaTotal=0
		para(l=0;l<3;l++)
		{
			para(c=0;c<3;c++)
			{
				escreva("  ",mat[l][c]=Util.sorteia(10, 90))
				
				somaTotal+=mat[l][c]

				se (l == c)
				somaDiagonal+=mat[l][c]
			}
			escreva("\n")
		}
			escreva ("\nA soma total de todos os valores é de: ",somaTotal)
			escreva ("\nA soma total da diagonal principal é de: ",somaDiagonal)
			
		
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 428; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */