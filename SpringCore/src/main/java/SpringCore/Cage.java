package SpringCore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Cage {
	
	@Autowired
	@Qualifier(value = "cow")
	private Animal animal;
	
	void animalSound() {
		animal.sound();
	}
}
