programa
{
	
	funcao inicio()
	{
		inteiro ano,mes,dia,calculo
		escreva("\nO ano que nasceu: ")
		leia(ano)
		escreva("\nO mês que você nasceu: ")
		leia(mes)
		escreva("\nO dia que você nasceu: ")
		leia(dia)
		limpa()
		
		calculo=(dia+(365*30)+(mes*30))
		escreva("\nTotal de dias: ",calculo)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 201; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */