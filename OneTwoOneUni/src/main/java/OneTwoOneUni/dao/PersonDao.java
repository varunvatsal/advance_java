package OneTwoOneUni.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import OneTwoOneUni.dto.Aadhar;
import OneTwoOneUni.dto.Person;

public class PersonDao {
	public EntityManager getEntityManager() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("varun");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		return entityManager;
	}
	
	public void savePerson(Person person) {
		EntityManager entityManager = getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Aadhar aadhar = person.getAadhar();
		entityTransaction.begin();
		entityManager.persist(aadhar);
		entityManager.persist(person);
		entityTransaction.commit();
	}
	
	public void updatePerson(int id, Person person) {
		EntityManager entityManager = getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Person returnPerson = entityManager.find(Person.class, id);
		
		if(returnPerson!=null) {
			person.setId(id);
			person.setAadhar(returnPerson.getAadhar());
			entityTransaction.begin();
			entityManager.merge(person);
			entityTransaction.commit();
		} else {
			System.out.println("id does not exist");
		}
	}
	
	public void updateAadhar(int id, Aadhar aadhar) {
		EntityManager entityManager = getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Aadhar returnAadhar = entityManager.find(Aadhar.class, id);
		
		if(returnAadhar!=null) {
			aadhar.setId(id);
			entityTransaction.begin();
			entityManager.merge(aadhar);
			entityTransaction.commit();
		} else {
			System.out.println("id does not exist");
		}
	}
	
	public void deletePerson(int id) {
		EntityManager entityManager = getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Person person = entityManager.find(Person.class, id);
		Aadhar aadhar = person.getAadhar();
		
		entityTransaction.begin();
		entityManager.remove(person);
		entityManager.remove(aadhar);
		entityTransaction.commit();
		
	}
	
	public void getPersonById(int id) {
		EntityManager entityManager = getEntityManager();
		
		System.out.println(entityManager.find(Person.class, id));
	}
	
	public void getAllPerson() {
		EntityManager entityManager = getEntityManager();
		
		Query query = entityManager.createQuery("select p from Person p");
		System.out.println(query.getResultList());
	}
}


//
//package onetooneuni.dao;
//
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.EntityTransaction;
//import javax.persistence.Persistence;
//import javax.persistence.Query;
//
//import onetooneuni.dto.Aadhar;
//import onetooneuni.dto.Person;
//
//public class Persondao {
//
//	public EntityManager getEntityManager() {
//		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("nanditha");
//		EntityManager entityManager=entityManagerFactory.createEntityManager();
//		return entityManager;
//		
//	}
//	
//	public void saveperson(Person person) {
//		EntityManager entityManager=getEntityManager();
//		EntityTransaction entityTransaction=entityManager.getTransaction();
//		Aadhar aadhar=person.getAadhar();
//		entityTransaction.begin();
//		entityManager.persist(aadhar);
//		entityManager.persist(person);
//		entityTransaction.commit();
//	}
//	
//	public void updateperson(int id,Person person) {
//		EntityManager entityManager=getEntityManager();
//		EntityTransaction entityTransaction=entityManager.getTransaction();
//		Person person2=entityManager.find(Person.class, id);
//		if(person2!=null) {
//			person.setId(id);
//			person.setAadhar(person2.getAadhar());
//			entityTransaction.begin();
//			entityManager.merge(person);
//			entityTransaction.commit();
//		}else {
//			System.out.println("id doesnt exist");
//		}
//	}
//	
//	public void updateaadhar(int id,Aadhar aadhar) {
//		EntityManager entityManager=getEntityManager();
//		EntityTransaction entityTransaction=entityManager.getTransaction();
//		Aadhar aadhar2=entityManager.find(Aadhar.class, id);
//		if(aadhar2!=null) {
//			aadhar.setId(id);
//			entityTransaction.begin();
//			entityManager.merge(aadhar);
//			entityTransaction.commit();
//		}else {
//			System.out.println("id doesnt exist");
//		}
//	}
//	
//	public void deleteperson(int id) {
//		EntityManager entityManager=getEntityManager();
//		EntityTransaction entityTransaction=entityManager.getTransaction();
//		Person person=entityManager.find(Person.class, id);
//		Aadhar aadhar=person.getAadhar();
//		entityTransaction.begin();
//		entityManager.remove(aadhar);
//		entityManager.remove(person);
//		entityTransaction.commit();
//	}
//	
//	public void getpersonbyid(int id) {
//		EntityManager entityManager=getEntityManager();
//		Person person=entityManager.find(Person.class, id);
//		System.out.println(person);
//	}
//	
//	public void getallperson() {
//		EntityManager entityManager=getEntityManager();
//		Query query=entityManager.createQuery("select p from Person p");
//		System.out.println(query.getResultList());
//	}
//}
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
