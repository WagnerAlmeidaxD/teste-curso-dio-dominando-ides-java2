package com.dio.model;

import java.util.Objects;

public class Gato {

	private String Nome ;
	private String cor ;
	private Integer idade;
	public Gato(String nome, String cor, Integer idade) {
		Nome = nome;
		this.cor = cor;
		this.idade = idade;
	}
	public Gato() {
		// TODO Auto-generated constructor stub
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	@Override
	public int hashCode() {
		return Objects.hash(Nome, cor, idade);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Gato other = (Gato) obj;
		return Objects.equals(Nome, other.Nome) && Objects.equals(cor, other.cor) && Objects.equals(idade, other.idade);
	}
	@Override
	public String toString() {
		return "Gato [Nome=" + Nome + ", cor=" + cor + ", idade=" + idade + "]";
	}

	
	/*public Gato(String nome,String cor,Integer idade) {
	this.Nome = nome;
	this.cor = cor;
	this.idade = idade;
	
	}*/
	
	
	
}
