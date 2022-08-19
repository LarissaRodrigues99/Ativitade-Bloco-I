package com.generation.estoque;

import java.util.ArrayList;
import java.util.Collections;

public class Loja 
{

	public static void main(String[] args) 
	{
		String material = " Estojo";
		String material2 = "\n  Caderno";
		String material3 = "\n  Lapis";
		String material4 = "\n  Borracha";
		
		ArrayList <String> materiais = new ArrayList <> ();
		
		materiais.add(material);
		materiais.add(material2);
		materiais.add(material3);
		materiais.add(material4);
		materiais.remove(0);
		
		System.out.println(materiais);
		
		Collections.sort(materiais);
		System.out.println("\n Ordem alfabética: ");
		System.out.println(materiais);
		
	}

}
