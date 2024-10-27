package ManyToOneUni.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import ManyToOneUni.dto.Employee;

public class EmployeeDao {
	
	public EntityManager getEntityManager() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("varun");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		return entityManager;
	}
	
	public void saveEmployee(Employee employee) {
		EntityManager entityManager = getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		entityTransaction.begin();
		entityManager.persist(employee);
		entityTransaction.commit();
	}
	public void updateEmployee(int eid, Employee employee) {
		EntityManager entityManager = getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Employee employee2 = entityManager.find(Employee.class, eid);
		
		if(employee2!=null) {
			employee.setEid(eid);
			employee.setCompany(employee2.getCompany());
			entityTransaction.begin();
			entityManager.merge(employee);
			entityTransaction.commit();
			
		}else {
			System.out.println("no such employee");
		}
	}
	
	public void deleteEmployee(int eid) {
		EntityManager entityManager = getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Employee employee2 = entityManager.find(Employee.class, eid);
		if(employee2!=null) {
			entityTransaction.begin();
			entityManager.remove(employee2);
			entityTransaction.commit();
		}else {
			System.out.println("no such employee to delete");
		}
	}
	
	public void getEmployeeById(int eid) {
		EntityManager entityManager = getEntityManager();
		System.out.println(entityManager.find(Employee.class, eid));
	}
	
	public void getAllEmployee() {
		EntityManager entityManager = getEntityManager();
		Query query = entityManager.createQuery("select e from Employee e");
		
		System.out.println(query.getResultList());
	}
	
	
	
}
