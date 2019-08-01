package com.adminfaces.estoque.bean;

import com.adminfaces.estoque.dao.UnidadeDAO;
import com.adminfaces.estoque.dao.UnityDao;
import com.adminfaces.estoque.model.Unidade;
import com.adminfaces.estoque.model.Unity;
import com.adminfaces.estoque.util.Transacional;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;

@Named
@ViewScoped
public class TesteSalvar implements Serializable {

    private static final long serialVersionUID = 1L;

    @Inject
    UnityDao unityDao;

    @Transacional
    public void salvar() {


        Unity unit = new Unity("ICN" , "RIO" , "RJ");



        this.unityDao.salvar(unit);

    }

}
