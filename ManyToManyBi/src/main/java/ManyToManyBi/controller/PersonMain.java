package ManyToManyBi.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import ManyToManyBi.dto.Language;
import ManyToManyBi.dto.Person;

public class PersonMain {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setName("varun vatsal");
		p1.setAddress("bengaluru");
		
		Person p2 = new Person();
		p2.setName("vivek");
		p2.setAddress("pune");
		
		Language l1 = new Language();
		l1.setName("English");
		l1.setOrigin("U.K.");
		
		Language l2 = new Language();
		l2.setName("Hindi");
		l2.setOrigin("india");
		
		List<Person> list2 = new ArrayList<Person>();
		list2.add(p1);
		list2.add(p2);
		
		List<Language> list = new ArrayList<Language>();
		list.add(l1);
		list.add(l2);
		
		p1.setList(list);
		p2.setList(list);
		
		l1.setList(list2);
		l2.setList(list2);
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("varun");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		
		entityTransaction.begin();
		entityManager.persist(p1);
		entityManager.persist(p2);
		entityManager.persist(l1);
		entityManager.persist(l2);
		entityTransaction.commit();
	}
}










