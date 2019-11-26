package com.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.entity.Card_Details;
import com.entity.Login_Credentials;
import com.entity.Product_Purchase_Information;
import com.entity.User_Profile;

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

	@Transactional
	public List<User_Profile> getUserDetails(int id) {
		String userDetails = "select d.username from User_Profile as d where d.userid=:id";
		Query q = entityManager.createQuery(userDetails);
		q.setParameter("id", id);
		List<User_Profile> up = q.getResultList();
		return up;
	}

	@Transactional
	public List<Login_Credentials> getLoginDetails() {
		String Login_Credentails = "select l from Login_Credentials l";
		Query q = entityManager.createQuery(Login_Credentails);
		List<Login_Credentials> lc = q.getResultList();
		System.out.println("repo" + lc.size());
		return lc;
	}

	public List<Card_Details> getCardDetails(int userid) {
		String jpql = "select p from Card_Details p where p.userprofile.userid=:id";
		Query q = entityManager.createQuery(jpql);
		q.setParameter("id", userid);
		List<Card_Details> cd = q.getResultList();
		System.out.println(cd.size());
		return cd;
	}
	
//	public List<Product_Purchase_Information>(int cardid)
//	{
//		String jpql = "select p from Product_Purchase_Information p where p.carddetails.cardno=:cardid";
//		Query q = entityManager.createQuery(jpql);
//		q.setParameter("cardid", cardid);
//		List<Product_Purchase_Information> pi = q.getResultList();
////check
//		System.out.println(cd.size());
//		
//		
//		
//		System.out.println(pi);
//	}


}
