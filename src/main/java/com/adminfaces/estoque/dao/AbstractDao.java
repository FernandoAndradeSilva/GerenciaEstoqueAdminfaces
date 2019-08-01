package com.adminfaces.estoque.dao;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import java.io.Serializable;

public abstract class AbstractDao<E, PK> implements Serializable{

    private static final long serialVersionUID = 1L;

    @Inject
    private EntityManager manager;

    public void save(E entidade) {

        manager.persist(entidade);
    }


    }




