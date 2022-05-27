package com.ty.many_to_one_uni;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveHospitalBranch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("raghav");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Branch branch1=new Branch();
		branch1.setName("Appolo-sub1");
		branch1.setState("karnataka");
		branch1.setCountry("India");
		branch1.setPhone(98745120l);
		
		Branch branch2=new Branch();
		branch2.setName("Appolo-sub-2");
		branch2.setState("Karnataka");
		branch2.setCountry("India");
		branch2.setPhone(3215487562l);
		
		Hospital hospital=new Hospital();
		hospital.setName("APPOLLO");
		hospital.setWeb("Google");
		
		branch1.setHospital(hospital);
		branch2.setHospital(hospital);
		
		
		entityTransaction.begin();
		entityManager.persist(branch1);
		entityManager.persist(branch2);
		entityManager.persist(hospital);
		entityTransaction.commit();
	}

}
