package SpringCore;

import org.springframework.stereotype.Component;

@Component
public class Cow implements Animal{
	
	@Override
	public void sound() {
		System.out.println("sound is mooo..");
	}
}
