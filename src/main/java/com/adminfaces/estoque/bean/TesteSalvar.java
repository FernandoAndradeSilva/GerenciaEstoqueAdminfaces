package com.adminfaces.estoque.bean;

import com.adminfaces.estoque.dao.UnidadeDao;
import com.adminfaces.estoque.model.Unidade;
import com.adminfaces.estoque.model.Usuario;
import com.adminfaces.estoque.service.UnidadeService;
import com.adminfaces.estoque.service.UsuarioService;
import com.adminfaces.estoque.util.Transacional;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;

@Named
@ViewScoped
public class TesteSalvar implements Serializable {


    private static final long serialVersionUID = 1L;

    @Inject
    UnidadeService unidadeService;

    @Inject
    UsuarioService usuarioService;

    @Transacional
    public void salvar() {

        Unidade unidade = new Unidade("AA" , "BB" , "CC");
        unidadeService.salvar(unidade);

        Usuario usuario = new Usuario("Bla" ,"fernando");
        usuarioService.salvar(usuario);
    }

    public void encontrar() {

        Unidade unidade = new Unidade("AA" , "BB" , "CC");
        unidadeService.salvar(unidade);

        System.out.println(unidadeService.encontraPorId(2l));

    }

}
