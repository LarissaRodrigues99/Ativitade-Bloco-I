package PacoteJava;
/*
 * 2- Fa�a um programa que receba 6 n�meros inteiros e mostre: 
� Os n�meros pares digitados;  
� A soma dos n�meros pares digitados; 
� Os n�meros �mpares digitados; 
� A quantidade de n�meros �mpares digitados.

 */

import java.util.Scanner;

public class Exercicio_vetor 
{

	public static void main(String[] args) 
	{
		Scanner leia=new Scanner(System.in);
		
		int vet[]=new int[6],i,numPares=0,numImpares=0;
			
		System.out.println("Digite 6 n�meros: ");
		
		for(i=0;i<6;i++)
		{
			vet[i]=leia.nextInt();
			
			if(vet[i]%2==0)
			{
				numPares+=vet[i];
			}
			else
			{
				numImpares+=vet[i];
			}
			
		}
		System.out.println("\nTotal de n�meros pares: "+numPares);
		System.out.println("\nTotal de n�meros impares: "+numImpares);
		
	}

}
