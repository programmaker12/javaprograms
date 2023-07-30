package com.tns.jpastart.entities;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
public class InheritanceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
        EntityManager em = factory.createEntityManager();
        em.getTransaction().begin();
        Employee employee = new Employee();
        employee.setEmployee_id(5);
        employee.setEmployee_name("Rohan");
        em.persist(employee);
        
        Manager manager = new Manager();
        manager.setEmployee_id(10);
        manager.setEmployee_name("Sania");
        manager.setDepartmentName("IT");
        em.persist(manager);
        
        em.getTransaction().commit();
		
		System.out.println("Added one employee and manager to database.");
		em.close();
		factory.close();
	}

}
