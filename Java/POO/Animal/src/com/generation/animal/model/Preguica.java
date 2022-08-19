package com.generation.animal.model;

public class Preguica 
{
	String nome;
	String som;
	String correr;
	int idade;
	
	public Preguica(String nome, String som, String correr, int idade) 
	{
		this.nome = nome;
		this.som = som;
		this.correr = correr;
		this.idade = idade;
	}

	public String getNome() 
	{
		return nome;
	}

	public void setNome(String nome) 
	{
		this.nome = nome;
	}

	public String getSom() 
	{
		return som;
	}

	public void setSom(String som) 
	{
		this.som = som;
	}

	public String getCorrer() 
	{
		return correr;
	}

	public void setCorrer(String correr) 
	{
		this.correr = correr;
	}

	public int getIdade() 
	{
		return idade;
	}

	public void setIdade(int idade) 
	{
		this.idade = idade;
	}
	public void Visualizar()
	{
	 System.out.println("**********************************************");
     System.out.println("\tDados Do Bicho Preguiça: ");
     System.out.println("***********************************************");
     System.out.println("Nome da preguiça: " + this.nome);
     System.out.println("Som que bicho preguiça faz: " + this.som);
     System.out.println("Bicho preguiça correndo: "+ this.correr);
     System.out.println("Idade da preguiça: " + this.idade);
	}
	
	
}
