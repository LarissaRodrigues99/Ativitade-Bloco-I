package com.generation.cachorro.model;

import java.util.Scanner;

public class Denuncia 
{

	        private String cidade2;
	        private String endereco2;
	        private String descricao2;
	        private int numero2; 

	        public Denuncia(String cidade2, String endereco2, String descricao2, int numero2)
	        {
				
			}

			public String getCidade2() 
	        {
	            return cidade2;
	        }
	        
	        public void setCidade2(String Cidade2) 
	        {
	            Cidade2 = cidade2;
	        }

	        public String getEndereco2(){
	            return endereco2; 
	        }

	        public void setEndereco2(String Endereco2)
	        {
	            Endereco2 = endereco2;
	        }

	        public String descricao2(){
	            return descricao2;
	        }

	        public void setDescricao2(String Descricao2)
	        {
	            Descricao2 = descricao2;
	        }

	        public int getNumero2()
	        {
	            return numero2;
	        }

	        public void setNumero2(int Numero2)
	        {
	            Numero2 = numero2; 
	        }
	        public void visualizeDenuncia() 
	    	{
	    		Scanner leia = new Scanner(System.in);
	    		System.out.println("\nInsira sua cidade: ");
	    		cidade2 = leia.next();
	    		System.out.println("\nInsira seu endereço: ");
	    		endereco2 = leia.next();
	    		System.out.println("\nDescreva o ocorrido: ");
	    		descricao2 = leia.next();
	    		System.out.println("\nNumero da casa: ");
	    		numero2 = leia.nextInt();
	    		Denuncia d1 = new Denuncia(cidade2,endereco2 ,descricao2,numero2);
	    		System.out.println("\nVocê gostaria de gato ou cachorro? ");
	    		System.out.println("\nDigite 1-Cachorro ou 2-Gato: ");
	    		d1.visualizeDenuncia();
	    	}
	}



