package com.example.sistemafinanceiro.entities;

public class Clientes {
	private int id;
	private String nome;
	private String endereco;
	private String email;
	private String telefone;
	private int conta;
	private String cpf;
	private String cnpj;
	

	public Clientes(int id, String nome, String endereco, String email, String telefone, int conta, String cpf,
			String cnpj) {
		super();
		this.id = id;
		this.nome = nome;
		this.endereco = endereco;
		this.email = email;
		this.telefone = telefone;
		this.conta = conta;
		this.cpf = cpf;
		this.cnpj = cnpj;
		
	}

	public Clientes(int id, String nome, String endereco, String email, String telefone, int conta, String cpf) {
		super();
		this.id = id;
		this.nome = nome;
		this.endereco = endereco;
		this.email = email;
		this.telefone = telefone;
		this.conta = conta;
		this.cpf = cpf;
		
	}

	
	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	
	public int getConta() {
		return conta;
	}

	public String getCpf() {
		return cpf;
	}

	public String getCnpj() {
		return cnpj;
	}

	
	
	

}