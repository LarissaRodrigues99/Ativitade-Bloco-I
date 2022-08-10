package PacoteJava;

import java.util.Scanner;

/*
 * Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99. (WHILE)
 */
public class ExercicioWhile
{

	public static void main(String[] args)
	{
		Scanner leia= new Scanner(System.in);
		int idade_21=0,idade_50=0,idade=0;
		
		System.out.println("Qual sua idade? ");
		idade=leia.nextInt();
		while(idade!=-99)
		{
			System.out.println("Qual sua idade? ");
			idade=leia.nextInt();
			
			if(idade<21)
			{
				idade_21=idade_21+1;
			}
			if(idade>50)
			{
				idade_50=idade_50+1;
			}
			
		}
		System.out.println("Idade menor que 21 "+idade_21);
		System.out.println("Idade maior que 50 "+idade_50);
		

	}

}
