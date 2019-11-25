package com.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;


import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.entity.Login_Credentials;

@Repository
public class FmsRespository {

	@PersistenceContext
	public EntityManager entityManager;

	@Transactional
	public void add(Object object) {
		entityManager.merge(object);
	}

	@Transactional
	public Object insertUser(Object object) { 
		Object obj = entityManager.merge(object);
		return obj;
	}

	@Transactional
	public Object fetchById(Class clazz, Object pk) {
		return entityManager.find(clazz, pk);
	}
 
		       
	}

