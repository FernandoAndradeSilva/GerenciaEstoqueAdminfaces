package com.adminfaces.estoque.model;

import org.hibernate.validator.constraints.Email;

import javax.persistence.Entity;

@Entity(name = "USUARIO")
public class Usuario extends AbstractEntity {


    private String nome;
    @Email(message = "EMAIL errado")
    private String email;

    public Usuario(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public Usuario() {
        super();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
