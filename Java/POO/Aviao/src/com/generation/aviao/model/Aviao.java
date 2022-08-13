package com.generation.aviao.model;

public class Aviao
{
	private String motor;
	private String placa;
	private String cor;
	private String modelo;
	private String combustivel;
	public Aviao(String motor, String placa, String cor, String modelo, String combustivel) 
	{
		this.motor = motor;
		this.placa = placa;
		this.cor = cor;
		this.modelo = modelo;
		this.combustivel = combustivel;
	}
	public String getMotor() 
	{
		return motor;
	}
	public void setMotor(String motor) 
	{
		this.motor = motor;
	}
	public String getPlaca() 
	{
		return placa;
	}
	public void setPlaca(String placa) 
	{
		this.placa = placa;
	}
	public String getCor() 
	{
		return cor;
	}
	public void setCor(String cor) 
	{
		this.cor = cor;
	}
	public String getModelo() 
	{
		return modelo;
	}
	public void setModelo(String modelo)
	{
		this.modelo = modelo;
	}
	public String getCombustivel() 
	{
		return combustivel;
	}
	public void setCombustivel(String combustivel)
	{
		this.combustivel = combustivel;
	}
	public void visualizar()
	{

        System.out.println("**********************************************");
        System.out.println("\nDados do Avião:");
        System.out.println("***********************************************");
        System.out.println("Tipo de motor: " + this.motor);
        System.out.println("Placa: " + this.placa);
        System.out.println("Cor " + this.cor);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Tipo de combustivel: " + this.combustivel);
	}
}
