package com.adminfaces.estoque.dao;

import com.adminfaces.estoque.model.Unidade;

public class UndImplTeste extends AbstractDao<Unidade, Long> {

    public void sav(Unidade unidade) {

        this.save(unidade);

    }
}
