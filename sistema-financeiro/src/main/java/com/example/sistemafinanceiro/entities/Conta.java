package com.example.sistemafinanceiro.entities;


import javax.persistence.Table;

@Table(name = "conta")
public class Conta {
	private int id;
	private int numero;
	private String cpf;
	private String cnpj;
	private double saldo;
	private String tipo;
	

	public Conta(int id,int numero, String cpf, String cnpj, double saldo, String tipo) {
		super();
		this.id = id;
		this.numero = numero;
		this.cpf = cpf;
		this.cnpj = cnpj;
		this.saldo = saldo;
		this.tipo = tipo;
	}


	public int getId() {
		return id;
	}

	public int getNumero() {
		return numero;
	}


	public double getSaldo() {
		return saldo;
	}

	
	public String getCpf() {
		return cpf;
	}


	public String getCnpj() {
		return cnpj;
	}

	

	public String getTipo() {
		return tipo;
	}
	
	
	public void tipo(String tipoconta) {
		this.tipo = tipoconta;
	}


	public double debitar(double valor) {
		if(valor <= this.saldo) {
			this.saldo -= valor;
		} else {
			System.out.println("SALDO INDISPONIVEL!");
		} 
		
		return this.saldo;
	}
	
	public void creditar(double valor) {
		this.saldo += valor;
	}

}
