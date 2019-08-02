package com.adminfaces.estoque.service;

import com.adminfaces.estoque.dao.UnidadeDao;
import com.adminfaces.estoque.model.Unidade;
import com.adminfaces.estoque.util.Transacional;


import javax.inject.Inject;
import java.io.Serializable;

public class UnidadeService implements Serializable {

    @Inject
    private UnidadeDao unidadeDao;



    public void salvar(Unidade unidade) {
        unidadeDao.save(unidade);

    }

    public Unidade encontraPorId(Long id) {
        return unidadeDao.findById(id);
    }


}
