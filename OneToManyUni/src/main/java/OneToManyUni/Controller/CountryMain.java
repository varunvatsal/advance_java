package OneToManyUni.Controller;

import java.util.ArrayList;
import java.util.List;

import OneToManyUni.dto.Country;
import OneToManyUni.dto.States;
import OneToManyUni.dao.CountryDao;
public class CountryMain {
	private static final String CountryDao = null;

	public static void main(String[] args) {
		Country country = new Country();
		country.setName("Bharat");
		country.setCapital("New Delhi");
		
		States s1 = new States();
		s1.setName("Karnataka");
		s1.setCapital("Bengaluru");
		
		States s2 = new States();
		s2.setName("Bihar");
		s2.setCapital("Patna");
		
		List<States> list = new ArrayList<States>();
		list.add(s1);
		list.add(s2);
		
		country.setList(list);
		
		CountryDao countryDao = new CountryDao();
//		countryDao.saveCountry(country);
//		countryDao.updateCountry(1, country);
//		countryDao.deleteCountry(1);
//		countryDao.getCountryById(2);
//		countryDao.getAllCountry();
	}
}
