package PacoteJava;

import java.util.Scanner;
/*
 * Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)
 */
public class ExercicioFor
{

	public static void main(String[] args) 
	{
		Scanner leia=new Scanner(System.in);
		int par=0,impar=0,x,y;
		for(x=1;x<=10;x++)
		{
			System.out.println("Informe um n�mero: ");
			y=leia.nextInt();
		
		if(y% 2==0)
		{
				par++;
		}
		else
		{		
				impar++;
		}
		}
		
		System.out.println("Foi digitado "+par+"n�meros pares. ");
		System.out.println("Foi digitado "+impar+"n�meros impares. ");
		
	}

}
