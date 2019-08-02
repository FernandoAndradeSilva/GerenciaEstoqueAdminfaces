package com.adminfaces.estoque.service;

import com.adminfaces.estoque.dao.UsuarioDao;
import com.adminfaces.estoque.model.Usuario;

import javax.inject.Inject;
import java.io.Serializable;

public class UsuarioService implements Serializable {

    private static final long serialVersionUID = 1L;

    @Inject
    private UsuarioDao usuarioDao;


    public void salvar(Usuario usuario) {
        usuarioDao.save(usuario);

    }

    public Usuario encontraPorId(Long id) {
        return usuarioDao.findById(id);
    }


}
