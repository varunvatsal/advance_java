package Cascade_Fetch;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class PersonMain {
	public static void main(String[] args) {
		Person person = new Person();
		person.setName("varun");
		person.setAddress("pune");
		
		Pancard pancard = new Pancard();
		pancard.setName("varun");
		pancard.setAddress("pune");
		
		person.setPancard(pancard);
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("varun");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		entityTransaction.begin();
		entityManager.persist(person);
		entityTransaction.commit();
		
		
	}
}
