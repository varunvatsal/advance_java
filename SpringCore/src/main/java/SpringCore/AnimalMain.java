package SpringCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnimalMain {
	
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Animal.xml");
		
		Cage cage = applicationContext.getBean("cage", Cage.class);
		cage.animalSound();
	}
}
