package ManyToManyUni.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import ManyToManyUni.dto.Person;

public class PersonDao {
	public EntityManager getEntityManager() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("varun");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		return entityManager;
	}
	
	public void savePerson(Person person) {
		EntityManager entityManager = getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		entityTransaction.begin();
		entityManager.persist(person);
		entityTransaction.commit();
	}
	
	public void updatePerson(int pid, Person person) {
		EntityManager entityManager = getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Person person2 = entityManager.find(Person.class, pid);
		if(person2!=null) {
			person.setPid(pid);
			person.setList(person2.getList());
			entityTransaction.begin();
			entityManager.merge(person);
			entityTransaction.commit();
		}else {
			System.out.println("no such person exists to update");
		}
	}
	
	public void deletePerson(int pid) {
		EntityManager entityManager = getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Person person = entityManager.find(Person.class, pid);
		if(person!=null) {
			entityTransaction.begin();
			entityManager.remove(person);
			entityTransaction.commit();
		}else {
			System.out.println("no such person exists to delete");
		}
	}
	
	public void getPersonById(int pid) {
		EntityManager entityManager = getEntityManager();
		
		System.out.println(entityManager.find(Person.class, pid));
	}
	
	public void getAllPerson() {
		EntityManager entityManager = getEntityManager();
		
		Query query = entityManager.createQuery("select p from Person p");
		
		System.out.println(query.getResultList());
	}
}
















