package com.generation.conta;

import com.generation.conta.model.Conta;

public class Menu 
{

	public static void main(String[] args) 
	{
		Conta conta1 = new Conta(158848, "123", "CC", "Liz", 1000.00f);
        conta1.visualizar();
        Conta conta2 = new Conta(345000, "123", "CC", "Eloa", 3500.00f);
        conta2.visualizar();
        System.out.println("Saldo da conta c1: " + conta1.getSaldo());
        conta1.setSaldo(500.0f);
        System.out.println("\nSaldo atualizado da conta c1: " + conta1.getSaldo());
        System.out.println("Saldo da conta c2: " + conta2.getSaldo());
        conta2.setTitular("Eloa Souza");
        System.out.println("Nome atualizado: " + conta2.getTitular());

        Conta c3 = new Conta();
        c3.visualizar();
        c3.setNumero(2670);
        c3.setTitular("Rodrigo");
        c3.visualizar();

        if (conta2.sacar(500.00f) == true) {
            conta2.visualizar();
        } else
            System.out.println("Saldo insuficinete");
        }

	}


