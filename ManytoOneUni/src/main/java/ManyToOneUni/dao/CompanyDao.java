package ManyToOneUni.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import ManyToOneUni.dto.Company;
import ManyToOneUni.dto.Employee;

public class CompanyDao {
	public EntityManager getEntityManager() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("varun");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		return entityManager;
	}
	
	public void saveCompany(Company company) {
		EntityManager entityManager = getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		entityTransaction.begin();
		entityManager.persist(company);
		entityTransaction.commit();
	}
	
	public void updateCompany(int cid, Company company) {
		EntityManager entityManager = getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Company company2 = entityManager.find(Company.class, cid);
		if(company2!=null) {
			company.setCid(cid);
			entityTransaction.begin();
			entityManager.merge(company);
			entityTransaction.commit();
		}else {
			System.out.println("no such company exists to update");
		}
	}
	
	public void deleteCompany(int cid) {
		EntityManager entityManager = getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Company company2 = entityManager.find(Company.class, cid);
		if(company2!=null) {
			entityTransaction.begin();
			entityManager.remove(company2);
			entityTransaction.commit();
		}else {
			System.out.println("no such company to delete");
		}
	}
	
//	public void getCompanyById(int cid) {
//		EntityManager entityManager = getEntityManager();
//		System.out.println(entityManager.find(Company.class, cid));
//	}
//	
//	public void getAllCompany() {
//		EntityManager entityManager = getEntityManager();
//		Query query = entityManager.createQuery("select c from Company c");
//		
//		System.out.println(query.getResultList());
//	}
}
