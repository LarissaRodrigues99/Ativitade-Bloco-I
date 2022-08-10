package PacoteJava;

import java.util.Scanner;

public class exemploWhile
{

	public static void main(String[] args)
	{
		Scanner leia= new Scanner(System.in);
		int idade;
		System.out.printf("Escreva a sua idade: ");
		idade=leia.nextInt();
		
		while(idade>=1)
		{
			System.out.printf("\nSua idade %d"+idade);
			if(idade>=18)
			{
				System.out.printf("\nVocê é maior. ");
			}
			else
				
			{
				System.out.printf("\nVocê é menor. ");
			}
			System.out.printf("\nEntre com sua idade. ");
			idade=leia.nextInt();
		}

	}

}
