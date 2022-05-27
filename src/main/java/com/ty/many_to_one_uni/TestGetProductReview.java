package com.ty.many_to_one_uni;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestGetProductReview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("raghav");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		Product product=entityManager.find(Product.class,2);
		if(product!=null)
		{
			System.out.println("product id is:"+product.getId());
			System.out.println("product name is :"+product.getName());
			System.out.println("product no i s:"+product.getProductnumber());
			System.out.println("cost is :"+product.getCost());
			
			
			
			
		}
	}

}
