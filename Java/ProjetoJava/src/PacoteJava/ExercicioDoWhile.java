package PacoteJava;
/*
 * Crie um programa que leia um n�mero do teclado at� que encontre um n�mero igual a zero.
 *  No final, mostre a soma dos n�meros
	digitados.(DO...WHILE)
 */
import java.util.Scanner;

public class ExercicioDoWhile {

	public static void main(String[] args) {
		Scanner leia=new Scanner(System.in);
		int soma=0,x;
		do 
		{
			System.out.printf("Digite um n�mero: ");
			x=leia.nextInt();
			soma=soma+x;
		}
		while (x!=0);
			System.out.printf("\nOs n�meros somados s�o: %d",soma);

	}

}
