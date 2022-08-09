package PacoteJava;
/*
 * 1-	Faça um programa que receba três inteiros e diga qual deles é o maior.
 */
import java.util.*;
public class Exescicio1 {
	public static void main(String args[])
	{
		Scanner ler = new Scanner(System.in);
		int n1,n2,n3,maior=0;
		{
			System.out.println("Entre valor 1: ");
			n1=ler.nextInt();
			System.out.println("Entre valor 2: ");
			n2=ler.nextInt();
			System.out.println("Entre valor 3: ");
			n3=ler.nextInt();
			
			
			if(maior<n1)
			{
				maior=n1;
					
			}
			if(maior<n2)
			{
				maior=n2;
			}
			if(maior<n3)
			{
				maior=n3;
			}
			System.out.printf(" O maior número: "+maior);
		}
	}
}
