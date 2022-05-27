package com.ty.many_to_one_uni;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveProductReview {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("raghav");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Review review1=new Review();
		review1.setRating(5);
		review1.setFeeback("good product");
		
		Review review2=new Review();
		review2.setRating(4);
		review2.setFeeback("very bad");
		
		Product product=new Product();
		product.setName("Phone");
		product.setProductnumber(15487);
		product.setCost(12000);
		product.setProductnumber(14786325l);
		
		review1.setProduct(product);
		review2.setProduct(product);
		
		entityTransaction.begin();
		entityManager.persist(review1);
		entityManager.persist(review2);
		entityManager.persist(product);
		entityTransaction.commit();
		
		
	}
}
