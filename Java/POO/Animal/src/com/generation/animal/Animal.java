package com.generation.animal;

import com.generation.animal.model.Cachorro;
import com.generation.animal.model.Cavalo;
import com.generation.animal.model.Preguica;

public class Animal 
{

	public static void main(String[] args) 
	{
		//String nome, String som, String correr, int idade
		Cachorro C = new Cachorro("Millu","Latiu","Correu",1);
		C.Visualizar();
		
		Cavalo Cavalo = new Cavalo("Flash","Relinchou","Correu",10);
		Cavalo.Visualizar();
		
		Preguica P = new Preguica("Soneca","Tristeza","Correu",20);
		P.Visualizar();
		
		
	}

}
