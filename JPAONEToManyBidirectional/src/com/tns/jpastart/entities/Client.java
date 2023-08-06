package com.tns.jpastart.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Client {

	public static void main(String [] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		em.getTransaction().begin();
		
		Department department=new Department();
		department.setId(10);
		department.setName("IT");
		
		Employee e1=new Employee();
		e1.setId(1003);
		e1.setName("Nick Fernadise");
		e1.setSalary(50000);
		
		Employee e2=new Employee();
		e2.setId(1004);
		e2.setName("Nelson D'souza");
		e2.setSalary(55000);
		
		Department depart=new Department();
		depart.setId(20);
		depart.setName("Computer");
		
		Employee e5=new Employee();
		e5.setId(1006);
		e5.setName("Nick");
		e5.setSalary(20000);
		
		Employee e6=new Employee();
		e6.setId(1005);
		e6.setName("Nelson");
		e6.setSalary(60000);
		
		depart.addEmployee(e5);
		depart.addEmployee(e6);
		
		em.persist(department);
		em.persist(depart);
		
		System.out.println("Addres deaprtment along with employee to database...");
		
		em.getTransaction().commit();
		
		em.close();
		factory.close();
	}
}
