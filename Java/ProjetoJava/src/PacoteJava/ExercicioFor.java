package PacoteJava;

import java.util.Scanner;
/*
 * Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
 */
public class ExercicioFor
{

	public static void main(String[] args) 
	{
		Scanner leia=new Scanner(System.in);
		int par=0,impar=0,x,y;
		for(x=1;x<=10;x++)
		{
			System.out.println("Informe um número: ");
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
		
		System.out.println("Foi digitado "+par+"números pares. ");
		System.out.println("Foi digitado "+impar+"números impares. ");
		
	}

}
