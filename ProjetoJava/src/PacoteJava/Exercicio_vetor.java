package PacoteJava;
/*
 * 2- Faça um programa que receba 6 números inteiros e mostre: 
• Os números pares digitados;  
• A soma dos números pares digitados; 
• Os números ímpares digitados; 
• A quantidade de números ímpares digitados.

 */

import java.util.Scanner;

public class Exercicio_vetor 
{

	public static void main(String[] args) 
	{
		Scanner leia=new Scanner(System.in);
		
		int vet[]=new int[6],i,numPares=0,numImpares=0;
			
		System.out.println("Digite 6 números: ");
		
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
		System.out.println("\nTotal de números pares: "+numPares);
		System.out.println("\nTotal de números impares: "+numImpares);
		
	}

}
