package PacoteJava;
/*
 * 3-	Fa�a um programa que receba a idade de uma pessoa e mostre na sa�da em qual categoria ela se encontra:
�	10-14 infantil
�	15-17 juvenil
�	18-25 adulto

 */
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String args[]) {
		// TODO Auto-generated method stub

		int idade;
		Scanner ler=new Scanner(System.in);
		System.out.println("Escreva a sua idade: ");
		idade=ler.nextInt();
		
		if((idade>=10 )&&(idade<=14))
		{
			System.out.println("Infantil!");
		}
		if((idade>=15)&&(idade<=17))
		{
			System.out.println("Juvenil!");
		}
		if((idade>=18)&&(idade<=25))
		{
			System.out.println("Adulto!");
		}
		
	}

}
