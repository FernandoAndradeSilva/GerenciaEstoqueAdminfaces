package com.adminfaces.estoque.model;

import javax.persistence.*;

@Entity
public class Unity extends AbstractEntity<Long> {


    private String nome;
    private String estado;
    private String cidade;

    public Unity(String nome, String estado, String cidade) {
        this.nome = nome;
        this.estado = estado;
        this.cidade = cidade;
    }

    public Unity() {
        super();
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
