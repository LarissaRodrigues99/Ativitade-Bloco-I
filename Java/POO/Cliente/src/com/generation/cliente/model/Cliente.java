package com.generation.cliente.model;

public class Cliente 
{
	private String cpf;
	private String nome;
	private int telefote;

	public Cliente(String cpf, String nome, int telefote) 
	{
		this.cpf = cpf;
		this.nome = nome;
		this.telefote = telefote;
	}

	public String getCpf() 
	{
		return cpf;
	}

	public void setCpf(String cpf)
	{
		this.cpf = cpf;
	}

	public String getNome() 
	{
		return nome;
	}

	public void setNome(String nome) 
	{
		this.nome = nome;
	}

	public int getTelefote() 
	{
		return telefote;
	}

	public void setTelefote(int telefote) 
	{
		this.telefote = telefote;
	}
	public void visualizar()
	{
		System.out.println("\n\t\tDados do cliente");
		System.out.println("\n************************************************");
		System.out.println("Nome do cliente: "+this.nome);
		System.out.println("Telefone do cliente: "+this.telefote);
		System.out.println("CPF do cliente: "+this.cpf);
	}
}
	 
