package ManyToManyUni.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import ManyToManyUni.dto.Language;

public class LanguageDao {
	public EntityManager getEntityManager() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("varun");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		return entityManager;
	}
	
	public void saveLanguage(Language language) {
		EntityManager entityManager = getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		entityTransaction.begin();
		entityManager.persist(language);
		entityTransaction.commit();
	}
	
	public void updateLanguage(int lid, Language language) {
		EntityManager entityManager = getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Language language2 = entityManager.find(Language.class, lid);
		
		if(language2!=null) {
			language.setLid(language2.getLid());
			
			entityTransaction.begin();
			entityManager.merge(language);
			entityTransaction.commit();
		}else {
			System.out.println("no such language to update");
		}
	}
	
	public void deleteLanguage(int lid) {
		EntityManager entityManager = getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Language language = entityManager.find(Language.class, lid);
		
		if(language!=null) {			
			entityTransaction.begin();
			entityManager.remove(language);
			entityTransaction.commit();
		}else {
			System.out.println("no such language to remove");
		}
	}
	
	public void getLanguageById(int lid) {
		EntityManager entityManager = getEntityManager();
		
		System.out.println(entityManager.find(Language.class, lid));
	}
	
	public void getAllLanguage() {
		EntityManager entityManager = getEntityManager();

		Query query = entityManager.createQuery("select l from Language l");
		
		System.out.println(query.getResultList());
	}
	
	
}













