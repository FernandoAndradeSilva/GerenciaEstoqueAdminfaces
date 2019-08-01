package com.adminfaces.estoque.dao;

import com.adminfaces.estoque.model.Unidade;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;

public abstract class AbstractDao<E, PK> implements Serializable{

    private final Class<E> entityClass =
            (Class<E>) ( (ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];

    private static final long serialVersionUID = 1L;

    @Inject
    private EntityManager manager;

    public void save(E entidade) {

        manager.persist(entidade);
    }

    public void update(E entidade) {

        manager.merge(entidade);
    }



    public E findById(PK id ) {

        return  manager.find(entityClass , id);
    }



    }




