package com.adminfaces.estoque.dao;

import com.adminfaces.estoque.model.Unidade;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import java.io.Serializable;
import java.util.List;

public class UnidadeDAO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Inject
	private EntityManager manager;
	
	public Unidade salvar(Unidade unidade) {
		return manager.merge(unidade);		
	}
	
	public void excluir(Unidade unidade) {
		try {
			unidade = porId(unidade.getId());
			manager.remove(unidade);
			manager.flush();

		} catch (Exception e) {
			System.out.println("Exceção");
		}
	}

	public Unidade porId(Long id) {
		return manager.find(Unidade.class, id);	
	}
	
	
	public List<Unidade> listAll() {
		return manager.createNativeQuery("SELECT * FROM Unidade", Unidade.class).getResultList();
	}

	
}	
