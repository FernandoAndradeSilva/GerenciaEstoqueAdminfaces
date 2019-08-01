package com.adminfaces.estoque.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity(name = "UNIDADE")
public class Unidade extends AbstractEntity{
	
	private String nome;
	private String estado;
	private String cidade;

	public Unidade() {
		super();
	}

	public Unidade(String nome, String estado, String cidade) {
		this.nome = nome;
		this.estado = estado;
		this.cidade = cidade;
	}


	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

}
