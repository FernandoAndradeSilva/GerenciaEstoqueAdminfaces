package com.adminfaces.estoque.bean;

import com.adminfaces.estoque.dao.UnidadeDao;
import com.adminfaces.estoque.model.Unidade;
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
    UnidadeDao unidadeDao;

    @Transacional
    public void salvar() {


        Unidade unidade = new Unidade("AA" , "BB" , "CC");

        unidadeDao.save(unidade);


        Unidade und = unidadeDao.findById(1l);



    }

}
