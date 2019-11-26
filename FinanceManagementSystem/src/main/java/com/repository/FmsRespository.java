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
import com.entity.Emi_Details;
import com.entity.Login_Credentials;
import com.entity.Product_Information;
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
	public Login_Credentials getLoginDetails() {
		String Login_Credentails = "select l from Login_Credentials l";
		Query q = entityManager.createQuery(Login_Credentails);
		Login_Credentials lc = (Login_Credentials) q.getSingleResult();
		return lc;
	}
  
	@Transactional
	public Card_Details getCardDetails(int userid) {
		String jpql = "select p from Card_Details p where p.userprofile.userid=:id";
		Query q = entityManager.createQuery(jpql);
		q.setParameter("id", userid);
		Card_Details cd =(Card_Details) q.getSingleResult();				
		return cd;
	}
     
	@Transactional
	public List<Product_Purchase_Information> getProductPurchaseDetail(int cardid) {
		String jpql = "select p from Product_Purchase_Information p where p.carddetails.cardno=:cardid";
		Query q = entityManager.createQuery(jpql);
		q.setParameter("cardid", cardid);
		List<Product_Purchase_Information> pi = q.getResultList();
		// check
		System.out.println(pi.size());
		return pi;

	}
	
    @Transactional
	public Product_Information getProductDetail(int productid) {
		String jpql = "select p from Product_Information p where p.id=:pid";
		Query q = entityManager.createQuery(jpql);
		q.setParameter("pid", productid);
		Product_Information pi =  (Product_Information)q.getSingleResult();
		return pi;

	}
    
    
    @Transactional
  	public  List<Product_Information> getAllProductDetail() {
  		String jpql = "select p from Product_Information p";
  		Query q = entityManager.createQuery(jpql);
  		List<Product_Information> pi =  (List<Product_Information>)q.getResultList();
  		
  		return pi;

  	}
	
	@Transactional
	public List<Emi_Details> getEmiDetails(int cardno)
	{
		String jpql = "select e from Emi_Details as e where e.carddetails.cardno=:cardno";
		Query q = entityManager.createQuery(jpql);
		q.setParameter("cardno", cardno);
		List<Emi_Details> emi = q.getResultList();
		// check
		System.out.println(emi.size());
		return emi;
		
	}

}
