package com.adminfaces.estoque.dao;

import com.adminfaces.estoque.model.Unity;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import java.io.Serializable;
import java.util.List;

public class UnityDao implements Serializable {

    private static final long serialVersionUID = 1L;

    @Inject
    private EntityManager manager;

    public Unity salvar(Unity unity) {
        return manager.merge(unity);
    }



}
