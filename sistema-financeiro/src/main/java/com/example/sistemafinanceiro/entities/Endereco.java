package com.example.sistemafinanceiro.entities;


import javax.persistence.Table;

@Table(name = "endereco")
public class Endereco {
	private int id;
	private String rua;
	private String numero;
	private String complemento;
	private String cep;
	private String bairro;
	private String cidade;
	private String estado;
	
	
	public Endereco( int id,String rua, String numero, String complemento, String cep, String bairro, String cidade,
			String estado) {
		super();
		this.id = id;
		this.rua = rua;
		this.numero = numero;
		this.complemento = complemento;
		this.cep = cep;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
	}


	public Endereco( int id,String rua, String numero, String cep, String bairro, String cidade, String estado) {
		super();
		this.id = id;
		this.rua = rua;
		this.numero = numero;
		this.cep = cep;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
	}


	public int getId() {
		return id;
	}


	public String getRua() {
		return rua;
	}


	public void setRua(String rua) {
		this.rua = rua;
	}


	public String getNumero() {
		return numero;
	}


	public void setNumero(String numero) {
		this.numero = numero;
	}


	public String getComplemento() {
		return complemento;
	}


	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}


	public String getCep() {
		return cep;
	}


	public void setCep(String cep) {
		this.cep = cep;
	}


	public String getBairro() {
		return bairro;
	}


	public void setBairro(String bairro) {
		this.bairro = bairro;
	}


	public String getCidade() {
		return cidade;
	}


	public void setCidade(String cidade) {
		this.cidade = cidade;
	}


	public String getEstado() {
		return estado;
	}


	public void setEstado(String estado) {
		this.estado = estado;
	}

	
	
	
	
	
}
