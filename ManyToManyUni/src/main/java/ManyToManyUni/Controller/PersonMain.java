package ManyToManyUni.Controller;

import java.util.ArrayList;
import java.util.List;

import ManyToManyUni.dao.LanguageDao;
import ManyToManyUni.dao.PersonDao;
import ManyToManyUni.dto.Language;
import ManyToManyUni.dto.Person;

public class PersonMain {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setName("varun vatsal");
		p1.setAddress("bengaluru");
		
		Person p2 = new Person();
		p2.setName("vivek");
		p2.setAddress("pune");
		
		Language l1 = new Language();
		l1.setLanguageName("English");
		l1.setOrigin("U.K.");
		
		Language l2 = new Language();
		l2.setLanguageName("Hindi");
		l2.setOrigin("india");
		
		List<Language> list = new ArrayList<Language>();
		list.add(l1);
		list.add(l2);
		
		p1.setList(list);
		p2.setList(list);
		
		PersonDao personDao = new PersonDao();
		LanguageDao languageDao = new LanguageDao();
		
		
//		languageDao.saveLanguage(l1);
//		languageDao.saveLanguage(l2);
//		
//		personDao.savePerson(p1);
//		personDao.savePerson(p2);
		
//		personDao.updatePerson(1, p1);
		
//		personDao.deletePerson(1);
		
//		personDao.getAllPerson();
		personDao.getPersonById(2);
		
	}
}
