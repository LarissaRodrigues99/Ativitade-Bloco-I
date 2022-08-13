package PacoteJava;
/*
 * 3- Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.
 */
import java.util.Scanner;

public class ExercicioMatriz {

	public static void main(String[] args) {
		Scanner leia=new Scanner(System.in);
		int mat[][]=new int[3][3],cont10=0,x,y;
		for(x=0;x<3;x++)
		{
			for(y=0;y<3;y++)
			{
				System.out.println("Digite um número");
				mat[x][y]=leia.nextInt();
				if(mat[x][y]>10)
				{
					cont10++;
					
				}
			}
		}
		System.out.println("\nValores maior que 10: "+cont10);
	}

}
