package hibernet_task1;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;


public class StudentCrud {
	public void saveStudent(Student student) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("varun");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		student.setId(student.getId());
		student.setName(student.getName());
		student.setAddress(student.getAddress());
		
		entityTransaction.begin();
		entityManager.persist(student);
		entityTransaction.commit();
	}
	
	public void updateStudent(int id, String name, String address) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("varun");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Student student = entityManager.find(Student.class, id);
		student.setName(name);
		student.setAddress(address);
		
		entityTransaction.begin();
		entityManager.merge(student);
		entityTransaction.commit();
	}
	
	public void deleteStudent(int id) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("varun");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Student student = entityManager.find(Student.class, id);
		
		entityTransaction.begin();
		entityManager.remove(student);
		entityTransaction.commit();
	}
	
	public void getStudentById(int id) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("varun");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Student student = entityManager.find(Student.class, id);
		
		System.out.println(student);
	}
	
	public void getAllStudent() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("varun");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Query query = entityManager.createQuery("select s from student s");
		
		List<Student> returnList = query.getResultList();
		System.out.println(returnList);
		
		
	}
}

















