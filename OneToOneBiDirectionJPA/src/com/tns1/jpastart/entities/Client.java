package com.tns1.jpastart.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Client {
	public static void main(String [] args) {
		
	
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
	EntityManager em = factory.createEntityManager();
	
	em.getTransaction().begin();
	
	Student student = new Student();
	student.setName("Sania");
	Address homeAddress = new Address();
	homeAddress.setStreet("66,Vakratunda Nagar");
	homeAddress.setCity("Ganeshnagar");
	homeAddress.setState("Maharashtra");
	homeAddress.setZipCode("400021");
	
	//inject address into student
	student.setAddress(homeAddress);
	
	//persist only student, no need to persist Address explicitly
	em.persist(student);
	em.getTransaction().commit();
	
	System.out.println("Added one student with address to database.");
	em.close();
	factory.close();
}
}