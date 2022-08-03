programa
{
/*
 2.	Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa que gere um vetor com os lançamentos,
 escreva esse vetor. A seguir determine e imprima a média aritmética dos lançamentos, contabilize e apresente também quantas
 foram as ocorrências da maior pontuação.
 */
	
	funcao inicio()
	{
		inteiro lancamento[10],maior=0,somaLan=0,maiorValor=0,contMaior=0,x
		real medLan
		para(x=0;x<10;x++)
		{
			escreva("Lançamento: ")
			leia(lancamento[x])
		
			somaLan=lancamento[x]
			se(lancamento[x]==6)
			{
				maiorValor++
			}
			se(maior<lancamento[x])
			{
				maior=lancamento[x]
			}
			
		}
		para(x=0;x<10;x++)
		{
			se(maior==lancamento[x])
			{
				contMaior++
			}
		}
		medLan=somaLan/10
		escreva("\n Média dos lançamentos: ",medLan)
		escreva("\n Quantidade de vezes que apareceu o número 6: ",maiorValor)
		escreva("\n Quantidade de vezes que apareceu o maior número: ",contMaior)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 460; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */