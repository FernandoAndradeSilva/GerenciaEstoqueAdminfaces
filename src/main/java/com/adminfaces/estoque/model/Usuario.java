package com.adminfaces.estoque.model;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity(name = "USUARIO")
public class Usuario extends AbstractEntity {

    @NotBlank(message = "O campo 'Nome' não pode ser vazio")
    @Size(min = 0 , max = 20 , message = "o campo 'Nome' precisa ter entre 0 e 20 caracteres")
    private String nome;


    @NotBlank(message = "O campo 'Email' não pode ser vazio")
    @Email(message = "Digite um email válido")
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
