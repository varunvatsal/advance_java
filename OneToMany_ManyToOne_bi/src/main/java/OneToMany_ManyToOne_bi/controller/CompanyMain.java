package OneToMany_ManyToOne_bi.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import OneToMany_ManyToOne_bi.dto.Company;
import OneToMany_ManyToOne_bi.dto.Employee;

public class CompanyMain {
	public static void main(String[] args) {
		Company company = new Company();
		company.setName("nike");
		company.setAddress("pune");
		
		Employee e1 = new Employee();
		e1.setName("varun");
		e1.setSalary(1000);
		
		Employee e2 = new Employee();
		e2.setName("vivek");
		e2.setSalary(2000);
		
		
		List<Employee> list = new ArrayList<Employee>();
		list.add(e1);
		list.add(e2);
		
		company.setList(list);
		e1.setCompany(company);
		e2.setCompany(company);
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("varun");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

//		entityTransaction.begin();
//		entityManager.persist(e1);
//		entityManager.persist(e2);
//		entityManager.persist(company);
//		entityTransaction.commit();
		
		System.out.println(entityManager.find(Employee.class, 1));
		
	}
}











