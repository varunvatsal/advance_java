package OneTwoOneUni.Controller;

import OneTwoOneUni.dao.PersonDao;
import OneTwoOneUni.dto.Aadhar;
import OneTwoOneUni.dto.Person;

public class PersonMain {
	public static void main(String[] args) {
		Person person = new Person();
		person.setId(2);
		person.setName("vivek vishal");
		person.setAddress("bengaluru");
		
		Aadhar aadhar = new Aadhar();
		aadhar.setId(2);
		aadhar.setName("vivek vishal");
		aadhar.setAddress("bengaluru");
		
		person.setAadhar(aadhar);
		
		PersonDao personDao = new PersonDao();
		personDao.savePerson(person);
//		personDao.updatePerson(1, person);
//		personDao.getAllPerson();
//		personDao.getPersonById(2);
//		personDao.deletePerson(2);
		
		
		
	}
}
