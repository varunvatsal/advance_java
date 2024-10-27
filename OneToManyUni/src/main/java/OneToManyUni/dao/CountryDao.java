package OneToManyUni.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import OneToManyUni.dto.Country;
import OneToManyUni.dto.States;

public class CountryDao {
	public EntityManager getEntityManager() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("varun");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		return entityManager;
	}
	
	public void saveCountry(Country country) {
		EntityManager entityManager = getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		List<States> list = country.getList();
		entityTransaction.begin();
		for(States state: list) {
			entityManager.persist(state);
		}
		entityManager.persist(country);
		entityTransaction.commit();
	}
	
	public void updateCountry(int cid, Country country) {
		EntityManager entityManager = getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Country country2 = entityManager.find(Country.class, cid);
		
		if(country2!=null) {
			country.setCid(cid);
			country.setList(country2.getList());
			entityTransaction.begin();
			entityManager.merge(country);
			entityTransaction.commit();
		}else {
			System.out.println("Id does not exist");
		}
	}
	
	public void deleteCountry(int cid) {
		EntityManager entityManager = getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Country country = entityManager.find(Country.class, cid);

		List<States> list = country.getList();
		entityTransaction.begin();
		for(States state: list) {
			entityManager.remove(state);
		}
		entityManager.remove(country);
		entityTransaction.commit();
	}
	
	public void getCountryById(int cid) {
		EntityManager entityManager = getEntityManager();
		System.out.println(entityManager.find(Country.class, cid));
	}
	
	public void getAllCountry() {
		EntityManager entityManager = getEntityManager();
		Query query = entityManager.createQuery("select c from Country c");
		
		System.out.println(query.getResultList());
	}
}

















