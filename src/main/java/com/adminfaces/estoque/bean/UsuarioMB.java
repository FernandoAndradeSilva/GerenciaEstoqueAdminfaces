package com.adminfaces.estoque.bean;

import com.adminfaces.estoque.model.Usuario;
import com.adminfaces.estoque.service.UsuarioService;
import com.adminfaces.estoque.util.Transacional;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;

@Named
@ViewScoped
public class UsuarioMB implements Serializable {


    private static final long serialVersionUID = 1L;

    private Usuario usuario = new Usuario();

    @Inject
    private UsuarioService usuarioServiceservice;

    @Transacional
    public void salvar() {
        usuarioServiceservice.salvar(usuario);

    }


    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
