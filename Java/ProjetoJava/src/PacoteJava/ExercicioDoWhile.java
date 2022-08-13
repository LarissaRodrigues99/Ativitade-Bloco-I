package PacoteJava;
/*
 * Crie um programa que leia um número do teclado até que encontre um número igual a zero.
 *  No final, mostre a soma dos números
	digitados.(DO...WHILE)
 */
import java.util.Scanner;

public class ExercicioDoWhile {

	public static void main(String[] args) {
		Scanner leia=new Scanner(System.in);
		int soma=0,x;
		do 
		{
			System.out.printf("Digite um número: ");
			x=leia.nextInt();
			soma=soma+x;
		}
		while (x!=0);
			System.out.printf("\nOs números somados são: %d",soma);

	}

}
