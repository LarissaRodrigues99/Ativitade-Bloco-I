package PacoteJava;

import java.util.Scanner;

/*
 *  Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a expressa em anos,
 *   meses e dias. 
 */
public class Idade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dia,mes,ano,calculo;
		Scanner leia=new Scanner(System.in);
		System.out.println("Que ano você nasceu? ");
		ano=leia.nextInt();
		System.out.println("Que mês você nasceu? ");
		mes=leia.nextInt();
		System.out.println("Que dia você nasceu? ");
		dia=leia.nextInt();
		
		calculo=(dia+(365*30)+(mes*30));
		System.out.println("Total: "+calculo);
	}

}
