package com.ty.many_to_one_uni;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestGetAmazonOrderItem {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("raghav");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction =entityManager.getTransaction();
		
		Item item=entityManager.find(Item.class,10);
		if(item!=null)
		{
			System.out.println("id is:"+item.getId());
			System.out.println("name is :"+item.getName());
			System.out.println("price is :"+item.getPrice());
			System.out.println("quantity is :"+item.getQuantity());
			System.out.println("order id"+item.getAmazonOrder().getId());
			System.out.println("name is:"+item.getAmazonOrder().getName());
			System.out.println("address is :"+item.getAmazonOrder().getAddress());
			System.out.println("status is:"+item.getAmazonOrder().getStatus());
		}
		else
		{
			System.out.println("item not ordered");
		}
		
	}
}
