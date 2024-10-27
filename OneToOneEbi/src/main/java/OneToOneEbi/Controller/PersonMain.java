package OneToOneEbi.Controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import OneToOneEbi.dto.Aadhar;
import OneToOneEbi.dto.Person;

public class PersonMain {
	public static void main(String[] args) {
		Person person = new Person();
		person.setName("varun");
		person.setAddress("bengaluru");
		
		Aadhar aadhar = new Aadhar();
		aadhar.setName("varun");
		aadhar.setAddress("bengaluru");
		
		person.setAadhar(aadhar);
		aadhar.setPerson(person);
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("varun");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		
//		entityTransaction.begin();
//		entityManager.persist(aadhar);
//		entityManager.persist(person);
//		entityTransaction.commit();
		
		System.out.println(entityManager.find(Person.class, 1));
	}
}
