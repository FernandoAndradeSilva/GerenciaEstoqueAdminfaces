package com.adminfaces.estoque.dao;

import com.adminfaces.estoque.model.Unidade;

public interface UnidadeDao {

    void save(Unidade unidade);

    void update(Unidade unidade);

    Unidade findById(Long id);
}
