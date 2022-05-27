package com.ty.many_to_one_uni;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveAmazonOrderItem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("raghav");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Item item1=new Item();
		item1.setName("Lenovo");
		item1.setPrice(20000.00);
		item1.setQuantity(1);
		
		Item item2=new Item();
		item2.setName("Bently");
		item2.setPrice(1000.00);
		item2.setQuantity(10);
		
		Item item3=new Item();
		item3.setName("Plane");
		item3.setPrice(6000.00);
		item3.setQuantity(15);
		
		
		AmazonOrder amazonOrder= new AmazonOrder();
		amazonOrder.setName("Expensive");
		amazonOrder.setAddress("rajajinagar");
		amazonOrder.setStatus("pacaking");
		
		item1.setAmazonOrder(amazonOrder);
		item2.setAmazonOrder(amazonOrder);
		item3.setAmazonOrder(amazonOrder);
		
		
		entityTransaction.begin();
		entityManager.persist(item1);
		entityManager.persist(item2);
		entityManager.persist(item3);
		entityManager.persist(amazonOrder);
		entityTransaction.commit();
	}

}
