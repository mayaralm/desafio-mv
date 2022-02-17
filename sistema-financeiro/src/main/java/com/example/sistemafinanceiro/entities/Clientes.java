package com.example.sistemafinanceiro.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "clientes")
public class Clientes {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String nome;
	private String endereco;
	private String email;
	private String telefone;
	private int conta;
	private String cpf;
	private String cnpj;
	

	public Clientes() {}
	
	public Clientes(long id, String nome, String endereco, String email, String telefone, int conta, String cpf,
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

	public Clientes(long id, String nome, String endereco, String email, String telefone, int conta, String cpf) {
		super();
		this.id = id;
		this.nome = nome;
		this.endereco = endereco;
		this.email = email;
		this.telefone = telefone;
		this.conta = conta;
		this.cpf = cpf;
		
	}

	
	public long getId() {
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
