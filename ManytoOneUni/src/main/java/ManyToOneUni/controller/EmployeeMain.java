package ManyToOneUni.controller;

import ManyToOneUni.dao.CompanyDao;
import ManyToOneUni.dao.EmployeeDao;
import ManyToOneUni.dto.Company;
import ManyToOneUni.dto.Employee;

public class EmployeeMain {
	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setName("varun vatsal");
		e1.setSalary(1000);
		
		Employee e2 = new Employee();
		e2.setName("vivek");
		e2.setSalary(2000);
		
		Company company = new Company();
		company.setName("Microsoft");
		company.setAddress("chennai");
		
		e1.setCompany(company);
		e2.setCompany(company);
		
		EmployeeDao employeeDao = new EmployeeDao();
		CompanyDao companyDao = new CompanyDao();
		
//		companyDao.saveCompany(company);
//		employeeDao.saveEmployee(e1);
//		employeeDao.saveEmployee(e2);
		
		
//		companyDao.updateCompany(2, company);
//		employeeDao.updateEmployee(3, e1);
		
//		employeeDao.getAllEmployee();
//		employeeDao.getEmployeeById(4);
		
		
	}
}
