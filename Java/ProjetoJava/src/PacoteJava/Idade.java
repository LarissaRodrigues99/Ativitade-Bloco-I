package PacoteJava;

import java.util.Scanner;

/*
 *  Fa�a um sistema que leia a idade de uma pessoa expressa em dias e mostre-a expressa em anos,
 *   meses e dias. 
 */
public class Idade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dia,mes,ano,calculo;
		Scanner leia=new Scanner(System.in);
		System.out.println("Que ano voc� nasceu? ");
		ano=leia.nextInt();
		System.out.println("Que m�s voc� nasceu? ");
		mes=leia.nextInt();
		System.out.println("Que dia voc� nasceu? ");
		dia=leia.nextInt();
		
		calculo=(dia+(365*30)+(mes*30));
		System.out.println("Total: "+calculo);
	}

}
