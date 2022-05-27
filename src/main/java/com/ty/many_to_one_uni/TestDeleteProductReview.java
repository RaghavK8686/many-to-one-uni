package com.ty.many_to_one_uni;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;



public class TestDeleteProductReview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("raghav");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Product product =new Product();
		Review review =entityManager.find(Review.class,1);
		
		
		entityTransaction.begin();
		
			entityManager.remove(review);
	
		entityManager.remove(product);
		entityTransaction.commit();
	}

}
