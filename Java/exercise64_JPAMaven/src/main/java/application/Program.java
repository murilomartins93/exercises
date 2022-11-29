package application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entities.Person;

public class Program {


	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		Person p = em.find(Person.class, 2);
		em.remove(p);
		em.getTransaction().commit();
		
		System.out.println("Done!");
		
		em.close();
		emf.close();
	}

}
