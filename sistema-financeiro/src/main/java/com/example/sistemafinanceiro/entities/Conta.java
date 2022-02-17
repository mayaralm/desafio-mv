package com.example.sistemafinanceiro.entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "conta")
public class Conta {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String numero;
	private String cpf;
	private String cnpj;
	private double saldo;
	private String tipo;
	
	public Conta() {}
	

	public Conta(long id,String numero, String cpf, String cnpj, double saldo, String tipo) {
		super();
		this.id = id;
		this.numero = numero;
		this.cpf = cpf;
		this.cnpj = cnpj;
		this.saldo = saldo;
		this.tipo = tipo;
	}


	public long getId() {
		return id;
	}

	public String getNumero() {
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
