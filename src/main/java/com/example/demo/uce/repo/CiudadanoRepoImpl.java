package com.example.demo.uce.repo;

import org.springframework.stereotype.Repository;

import com.example.demo.uce.modelo.Ciudadano;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CiudadanoRepoImpl implements ICiudadanoRepo {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Ciudadano cuidadano) {
		// TODO Auto-generated method stub
		this.entityManager.persist(cuidadano);
	}

}
